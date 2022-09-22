package Recursion;

public class CountZeroRecursion {

	public static void main(String[] args) {
		System.out.println(count(1032,0));
	}
	
	public static int count(int n,int c) {
		if(n == 0) {
			return c;
		}
		if(n%10 == 0) {
			return count(n/10, c+1);
		}
		return count(n/10, c);
	}

}
