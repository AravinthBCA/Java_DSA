package Maths;

public class SquareRootUsingBinarySearch {

	public static void main(String[] args) {
		int square = 40, precisions = 3;
		System.out.println(sqrt(square,precisions));
	}
	
	public static double sqrt(int square, int precisions) {
		int start = 0, end = square;
		double root = 0.0;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(mid * mid == square) {
				return mid;
			}
			if(mid * mid > square) {
				end = mid - 1;
			}
			else { 
				start = mid + 1;
				root = mid;
			}
		}
		double incr = 0.1;
		for(int i=0; i<precisions; i++) {
			while(root * root <= square) {
				root += incr;
			}
			root -= incr;
			incr /= 10; // it convert the incr 0.1 to 0.01
		}
		return root;
	}

}
