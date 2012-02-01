package cluster;


import java.io.PrintWriter;

import basemodel.AgentInteface;
import basemodel.BaseModelInterface;
import basemodel.Parameters;

import episodicriskmodel.EpisodicAgentInterface;


/**
 * 
 * @author shah
 *
 */
public class ClusterRecorder extends Parameters {
	private BaseModelInterface model;
	private ClusterEngine[] clusterEngine;

	public ClusterRecorder(BaseModelInterface _model, String prefix, OUTBREAK_TYPE outbreakType) {
		this.model = _model; 
		int numEngines = OUTBREAK_RECORD.values().length;
		clusterEngine = new ClusterEngine[numEngines];		
		clusterEngine = new ClusterEngine[OUTBREAK_RECORD.values().length];		
		for (OUTBREAK_RECORD outbreakRecord : OUTBREAK_RECORD.values()) {
			clusterEngine[outbreakRecord.ordinal()] = new ClusterEngine(prefix, outbreakType, outbreakRecord);
		}			
	}

	/** */
	public void step() {
		startClusterEngine();
		checkClusterEngine();
		recordPopulationVariables();
	}

	public void recordOutput(int run, PrintWriter[] incidenceWriter, PrintWriter[] outbreakWriter, PrintWriter[] plfitWriter) {
		if (RecordOutbreak) {
			try {
				for (OUTBREAK_RECORD obRecord : OUTBREAK_RECORD.values()) {
					clusterEngine[obRecord.ordinal()].writeJointDistSummary(run, incidenceWriter, outbreakWriter);
					clusterEngine[obRecord.ordinal()].saveExtStats(plfitWriter);
				}					
			} catch (Exception e) {
				System.err.println("Error in ClusterRecorder::recordOutput.");
				e.printStackTrace();
			}			
		}
	}

	public void updateEpisodicEpisodicAgentClusterRecord(EpisodicAgentInterface individual) {
		if (RecordOutbreak) {
			int currentTick = model.getCurrentTick();
			for (OUTBREAK_RECORD outbreakRecord : OUTBREAK_RECORD.values()) {
				ClusterEngine engine = clusterEngine[outbreakRecord.ordinal()];
				if (engine.isStopped() == false) {
					if (individual.isRemovedAHICluster() == false
							&& (individual.isDead()
									|| (individual.getAHIClusterID() != -1
											&& individual.isInfected() == true
											&& engine.outbreakCriteria(new Integer(currentTick), individual) == false))) {				
						engine.removeTimeRecord(new Integer(currentTick), individual);

					}
				}
			}
		}	
	}

	public void recordTransmission(AgentInteface infector, AgentInteface susceptible) {
		if (RecordOutbreak) {
			int currentTick = model.getCurrentTick();
			for (OUTBREAK_RECORD outbreakRecord : OUTBREAK_RECORD.values()) {
				ClusterEngine engine = clusterEngine[outbreakRecord.ordinal()];
				if (engine.shouldRecordTransmission(currentTick)) {
					engine.addTransmission(currentTick, infector, susceptible);
				}
			}
		}

	}

	private void startClusterEngine() {
		if (RecordOutbreak) {
			for (OUTBREAK_RECORD outbreakRecord : OUTBREAK_RECORD.values()) {
				ClusterEngine engine = clusterEngine[outbreakRecord.ordinal()];
				if (engine.isStopped() == false) {
					engine.shouldBeginRecording(model.getCurrentTick());
				}
			}
		}
	}	

	private void checkClusterEngine() {
		if (RecordOutbreak) {
			for (OUTBREAK_RECORD outbreakRecord : OUTBREAK_RECORD.values()) {
				ClusterEngine engine = clusterEngine[outbreakRecord.ordinal()];
				if (engine.isStopped() == false) {
					engine.step(new Integer(model.getCurrentTick()));
					if (engine.isStopped()) {
						//Output all and early infection transmissions
						engine.outputRecord();
						model.resetIndividualsOutbreakRecord();
					}
				}
			}
		}		
	}

	private void recordPopulationVariables() {
		if (RecordOutbreak) {
			for (OUTBREAK_RECORD outbreakRecord : OUTBREAK_RECORD.values()) {
				ClusterEngine recorder = clusterEngine[outbreakRecord.ordinal()];
				if (recorder.isStopped() == false) {
					recorder.setPopulationStats(model.getCurrentTick(), (int)model.getNumHIV(), model.returnPopulationSize());
				}
			}
		}
	}

	public ClusterEngine[] getClusterEngine() {
		return clusterEngine;
	}

	public void setClusterEngine(ClusterEngine[] clusterEngine) {
		this.clusterEngine = clusterEngine;
	}	
}