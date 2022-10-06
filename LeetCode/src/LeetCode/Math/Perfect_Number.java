package LeetCode.Math;

/* https://leetcode.com/problems/perfect-number/
 * Input: num = 28
 * Output: true
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * 1, 2, 4, 7, and 14 are all divisors of 28.
 */

public class Perfect_Number {

	public static void main(String[] args) {
		int num = 99999995;
		System.out.println(checkPerfectNumber(num));
	}

	public static boolean checkPerfectNumber(int num) {
		int sum = 0;
		for(int i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		return sum == num ? true : false;
	}

}
