package Maths;

public class UsingEuclideanAlgorithmFindHCM_GCD {

	public static void main(String[] args) {
		System.out.println(gcd(15,20));
		System.out.println(lcm(15,20));
	}
	
	public static int gcd(int a ,int b) {
		if(a == 0) {
			return b;
		}
		return gcd(b%a , a);
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
