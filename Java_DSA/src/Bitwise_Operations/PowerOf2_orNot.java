package Bitwise_Operations;

public class PowerOf2_orNot {

	public static void main(String[] args) {
		int n = 5, sum = 0;
		// solution 1
		while(n > 0) {
			int last = n & 1;
			n = n >> 1;
			sum += last;
		}
		if(sum > 1) 
			System.out.println("The number is not power of 2");
		else
			System.out.println("The number is power of 2");
		
		// solution 2
		n=15;
		// if n == 0 means false but below line return true so we need to add if stmt for n = 0 
		System.out.println( (n & (n-1)) == 0 ? "Power of 2" : "Not Power of 2");
	}

}
