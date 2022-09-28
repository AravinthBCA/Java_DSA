package LeetCode;

/* https://leetcode.com/problems/sqrtx/
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is 
returned.
input = 4 and output = 2, input = 8 and output = 2 extract output was 2.82842 and since the decimal part is truncated, 
2 is returned.
*/ 


public class SqrtOfNumber {

	public static void main(String[] args) {
		solution(8);
	}
	
	public static void solution(int n) {
		long start = 1,end = n;
		while(start <= end) {
			long mid = start + (end - start) / 2;
			if(mid * mid == n) {
				System.out.println(mid);
				return;
			}
			if(mid * mid < n) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		System.out.println(end);
	}

}
