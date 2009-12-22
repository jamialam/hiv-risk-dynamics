package mle;

public class Eval {

	double[] Y = {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] X = {9,1,4,1,5,1,3,4,2,3,7,6,2,0,0,1,0,10,6,1,1,1,0,3,8,2,3,2,2,4,2,4,3,3,4,2,3,0,4,5,3,4,2,4,1,4,4,2,3,6,1,4,7,6,3,2,6,2,9,3,2,5,3,5,4,3,3,2,6,1,0,2,0,3,2,5,7,6,2,6,5,7,5,5,0,5,3,5,6,0,3,4,2,5,3,4,5,6,1,2,4,3,6,2,4,6,8,1,2,0,6,4,1,0,6,5,5,4,5,2,6,1,6,0,2,4,0,7,6,8,2,4,3,2,0,0,5,2,2,2,5,1,1,3,0,5,3,2,2,2,3,2,6,6,7,1,4,6,4,1,6,6,2,5,4,4,4,2,0,6,2,2,0,2,1,6,4,2,8,3,2,4,4,3,0,4,7,3,5,2,0,1,8,3,4,2,2,1,2,3,1,5,6,5,3,4,2,5,0,3,4,4,2,3,2,0,5,3,3,5,4,6,4,5,1,2,4,3,3,1,4,3,2,0,4,7,0,3,5,4,5,3,6,3,5,4,7,7,1,2,4,7,5,3,2,1,7,5,2,3,2,4,0,0,4,7,5,3,2,2,6,2,5,10,6,4,1,6,3,4,2,6,1,5,5,1,1,3,2,2,3,7,3,4,4,0,3,4,0,4,1,3,4,4,5,2,7,3,6,2,5,8,3,2,3,4,4,5,3,4,7,0,4,2,3,0,4,2,5,2,5,6,4,4,2,3,6,1,1,3,4,3,1,3,3,4,6,1,5,8,1,6,3,6,1,4,3,4,3,1,9,6,5,2,3,3,4,3,2,4,3,0,3,2,6,0,3,2,4,1,10,4,1,4,4,3,2,5,2,6,2,3,5,1,6,1,8,6,2,4,4,1,1,3,1,3,2,3,4,4,2,3,4,2,4,5,3,6,2,2,2,4,3,4,0,9,7,3,3,2,2,0,0,3,5,3,2,3,4,4,2,4,1,0,4,4,1,1,3,2,7,1,5,1,3,2,2,1,4,1,4,3,4,4,5,0,5,2,7,5,9,4,0,2,2,3,1,2,0,3,6,6,5,4,1,6,6,3,5,2,3,5,2,2,2,3,2,0,3,2,2,6,8,3,2,3,4,0,0,3,0,1,3,4,3,0,1,0,6,4,2,3,2,5,3,7,5,3,5,1,3,5,4,3,5,8,3,4,2,0,2,6,5,7,0,5,4,2,7,3,4,0,4,3,5,3,6,4,3,0,2,0,4,7,5,4,2,5,1,2,1,7,3,1,1,3,0,9,2,4,7,3,1,1,3,3,2,0,4,5,4,2,4,5,5,1,4,1,3,1,2,4,3,7,4,3,3,1,2,4,3,4,4,3,0,3,2,4,6,4,3,5,6,3,4,4,5,5,3,2,2,1,2,4,4,2,3,4,1,2,2,3,5,6,5,2,5,3,3,5,6,6,5,2,2,0,2,2,3,2,4,5,6,4,3,2,4,3,3,5,0,3,2,6,4,0,7,3,2,4,3,0,6,1,4,1,6,2,2,5,2,7,2,4,6,5,2,6,7,3,6,1,4,5,2,0,5,8,4,5,4,4,3,4,5,4,2,2,3,4,4,3,2,3,2,3,4,5,1,4,3,0,3,4,3,3,3,4,2,3,2,2,4,2,3,1,2,1,0,2,5,2,5,2,3,4,4,5,2,2,5,3,0,5,3,0,7,4,2,4,1,3,3,5,3,1,4,5,1,4,3,2,4,1,3,5,2,4,6,1,0,2,2,8,1,2,3,7,0,2,2,7,5,2,0,5,4,5,2,7,3,1,1,3,4,4,6,1,3,3,4,2,7,6,3,0,3,0,3,3,2,5,5,8,5,1,6,2,5,5,4,7,3,0,8,3,2,2,8,2,1,4,2,3,7,0,3,5,2,3,4,3,6,2,3,4,3,2,2,5,2,3,2,2,0,1,3,3,2,5,4,3,0,5,5,1,6,3,2,3,0,4,2,2,4,4,5,1,6,2,2,5,9,3,4,5,4,0,7,4,4,0,6,5,2,3,0,5,3,4,6,1,4,2,4,2,0,5,4,4,4,3,6,4,4,2,1,3,2,3,6,3,4,0,1,2,4,1,4,4,1,4,2,3,2,5,4,4,3,0,9,5,4,6,3,2,7,2,2,5,4,0,6,5,5,4,3,1,3,5,3,5,3,3,5,4,3,1,7,0,2,1,4,4,6,6,4,3,4,4,3,5,3,2,4,7,3,3,4,2,8,3,3,2,5,5,5,2,4,0,4,4,6,0,4,4,3,4,0,5,5,1,3,3,3,3,3,1,3,7,2,2,4,3,3,4,3,3,5,5,8,5,5,4,0,4,1,6,5,2,6,2,3,4,0,0,0,7,1,5,2,7,6,4,2,6,3,7,0,9,6,6,5,5,4,5,4,2,3,1,5,4,4,1,6,3,6,3,6,6,2,0,0,4,0,0,4,4,5,1,0,3,2,5,3,5,7,2,3,7,3,2,0,5,3,5,4,4,9,7,5,4,3,2,5,5,2,0,5,8,4,10,5,9,4,4,1,4,3,3,4,2,4,5,7,5,3,5,4,4,6,5,8,3,5,6,3,5,4,5,4,7,3,1,1,4,5,6,4,3,4,6,4,2,3,3,3,6,3,4,5,2,2,3,3,2,0,3,2,3};
	double theta  = 0.0105;
	
	public void function2() {
		double sum = 0; int count = 0;
		for (int i=0; i<Y.length; i++) {
			sum += 1-Math.pow(1-theta, X[i]);
			if (Y[i] == 1) count++;
		}
		System.out.println("sum: " + sum + " count: " + count);
		
	}
	
	public void function() {
		double[] val = new double[1200];
		double prod = 1;
		
		for (int i=0; i<Y.length; i++) {
			val[i] = Math.pow(1-Math.pow((1-theta), X[i]), Y[i]) 
						* Math.pow(Math.pow((1-theta), X[i]), 1-Y[i]);
			System.out.println("val: " + val[i]);
			prod *= val[i];
			System.out.println("prod: " + prod);
		}
		
		System.out.println("prod: " + prod);
		
	}
	public static void main(String[] args) {
		Eval eval = new Eval();
		eval.function();
	}

}
