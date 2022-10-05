package LeetCode;

import java.util.Arrays;

/* https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * conditions -> i != j, 0 <= i, j < arr.length, arr[i] == 2 * arr[j]
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 */

public class Check_If_N_Its_Double_Exist {

	public static void main(String[] args) {
		int arr[] = {3,1,7,11};
		System.out.println(checkIfExist(arr));
	}

	public static boolean checkIfExist(int[] arr) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			int result = binarySearch(arr,arr[i]*2);
			if(result != i && result != -1) {
				return true;
			}
		}
		return false;
	}
	
	public static int binarySearch(int arr[],int target) {
		int start = 0, end = arr.length-1;
		while(start <= end) {
			int mid = start + (end-start) / 2;
			if(arr[mid] > target) {
				end = mid - 1;
			}
			else if(arr[mid] < target) {
				start = mid +1;
			}
			else
				return mid;
		}
		return -1;
	}

}
