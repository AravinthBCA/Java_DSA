package Maths;

public class OptimizedSquareRoot {

	public static void main(String[] args) {
		int n = 40;
		System.out.println(sqrt(n));
	}
	
	public static double sqrt(int n) {
		double x = n;
		while(true) {
			double root = 0.5 * ( x + ( n / x ));
			if(Math.abs(root - x) < 0.01) {
				break;
			}
			x = root;
		}
		return x; 
	}

}
