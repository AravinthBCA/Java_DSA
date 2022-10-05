package LeetCode;

/* https://leetcode.com/problems/kth-missing-positive-number/
 */

public class Kth_Missing_Positive_Number {

	public static void main(String[] args) {
		int arr[] = {2,3,4,7,11};
		System.out.println(findKthPositive(arr,4));
	}
	
	public static int findKthPositive(int[] arr, int k) {
		int start = 0, end = arr.length;
		while(start < end) {
			int mid = start + (end-start) / 2;
			if(arr[mid] - mid - 1 < k) 
				start = mid+1;
			else
				end = mid;
		}
		return start + k;
	}

}
