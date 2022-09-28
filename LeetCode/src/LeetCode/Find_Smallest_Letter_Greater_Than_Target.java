package LeetCode;

/* https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest 
 * character in the array that is larger than target.  Note that the letters wrap around.
 * input = char arr[]  = {'c','f','g'},target='a' and output = 'c'
 */

public class Find_Smallest_Letter_Greater_Than_Target {

	public static void main(String[] args) {
		char arr[]  = {'c','f','g'};
		System.out.println(nextGreatestLetter(arr,'f'));
	}
	
	public static char nextGreatestLetter(char arr[], char target) {
		int start = 0, end = arr.length;
		if(target >= arr[arr.length-1]) {
			return arr[0];
		}
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] > target) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return arr[end];
	}

}
