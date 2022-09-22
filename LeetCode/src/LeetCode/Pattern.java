package LeetCode;

public class Pattern {

	public static void main(String[] args) {
		SquareNumberPattern();
	}
	
	public static void ArrowPattern() {
		int n = 10,col = 0;
		for(int i=1; i<n*2; i++) {
			col = i <= n ? i : col-1;
			for(int j=0; j<col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void starPattern() {
		int col = 0, n = 5;
		for(int i=1; i<n*2; i++) {
			col = i <= n ? i : col-1;
			for(int k=0; k<n-col; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void PyramidNumberPattern() {
		int n = 5, c = 0;
		for(int i=1; i < n*2; i++) {
			c = i > n ? 2*n-i : i;
			for(int s=0; s<n-c; s++) {
				System.out.print(" ");
			}
			for(int col=c; col>=1; col--) {
				System.out.print(col);
			}
			for(int col=2; col<=c; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	public static void SquareNumberPattern() {
		int n = 3, temp = n*2;
		for(int i=0; i<=temp; i++) {
			for(int j=0; j<=temp; j++) {
				int value = n - Math.min(Math.min(i, temp-i), Math.min(j, temp-j)) + 1;
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
