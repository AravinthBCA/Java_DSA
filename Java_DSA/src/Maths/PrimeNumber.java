package Maths;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 4, i = 2;
		boolean prime = true;
		while(i * i <= n) {
			if(n % i == 0) {
				prime = false;
			}
			i++;
		}
		System.out.println(prime == true);
		
	}

}
