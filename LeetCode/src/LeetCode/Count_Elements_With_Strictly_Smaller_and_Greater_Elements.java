package LeetCode;

/* https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/
 * Input: nums = [11,7,2,15]
 * Output: 2
 * Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
 * Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
 * In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
 */

public class Count_Elements_With_Strictly_Smaller_and_Greater_Elements {

	public static void main(String[] args) {
		int arr[] = {11,7,2,15};
		System.out.println(countElements(arr));
	}
	
	public static int countElements(int[] arr) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minDuplicate = 0, maxDuplicate = 0, n = arr.length;
		if(n <= 1) {
			return 0;
		}
		for(int i : arr){
			if(i < min) {
				min = i; minDuplicate = 0;
			}
			if(i > max) {
				max = i; maxDuplicate = 0;
			}
			if(i == min)
				minDuplicate++;
			if(i == max)
				maxDuplicate++;
		}
		int res = n - minDuplicate - maxDuplicate;
		return res < 0 ? 0 : res;
	}
}