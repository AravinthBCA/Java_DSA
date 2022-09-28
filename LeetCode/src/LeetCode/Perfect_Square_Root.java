package LeetCode;

public class Perfect_Square_Root {
	public static void main(String[] args) {
		int num = 2147395599;
		System.out.println(checkSquare(num));
	}

	private static int checkSquare(int num) {
		long start = 1, end = num;
		while(start <= end) {
			long mid = start + (end-start) / 2;
			if(mid*mid == num) {
				return (int)mid;
			}
			if(mid*mid > num) {
				end = mid - 1;
			}
			else {
				start = mid + 1; 
			}
		}
		return (int)end;
	}
	
	
}
