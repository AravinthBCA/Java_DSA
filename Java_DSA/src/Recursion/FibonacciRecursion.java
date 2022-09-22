package Recursion;

public class FibonacciRecursion {

	public static void main(String[] args) {
		long temp = formulaFibo(50);
		System.out.println(temp);
	}
	
	public static long formulaFibo(int n) {
		return (long)(Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5));
	}
	
	public static int fibo(int n) {
		if(n < 2) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}

}
