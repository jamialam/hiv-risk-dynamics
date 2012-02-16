package partnershipmodel;

import java.util.ArrayList;
import cluster.Edge;

import interfaces.AgentInterface;

/**
 * 
 * Jong-Hoon Kim's model integrated with outbreaks library (c.f. Kim et al. 2010)
 * @author Jong-Hoon Kim (original)
 * @author Modified by: Shah Jamal Alam, Koopman Lab (Dynamic Causal Systems in Epidemiologic Analysis), University of Michigan 2011.
 *
 */

public interface PartnershipAgentInterface extends AgentInterface, PartnershipParametersInterface {
	public int getExitTick();
	public void setExitTick(int exitTick);
	public int getEntryTick();
	public void setEntryTick(int entryTick);
	public void removeEdgesFromList(ArrayList<Edge> edgelist);
	public void dissolveEdges();
	public int getLifeTimePartners();
	public void setLifeTimePartners(int lifeTimePartners);
	public int getNumInfectee();
	public void setNumInfectee(int numInfectee);
}
