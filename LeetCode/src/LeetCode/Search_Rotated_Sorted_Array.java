package LeetCode;

/* https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

public class Search_Rotated_Sorted_Array {

	public static void main(String[] args) {
		int arr[] = {6,7,8,0,1,2,3};
		search(arr,2);
	}
	
	public static void search(int arr[], int target) {
		int pivot = binarySearch(arr);
		System.out.println(pivot);
		if(arr[arr.length-1] > target) {
			binarySearch(arr);
		}
	}
	
	public static int binarySearch(int arr[]) {
		int start = 0, end = arr.length;
		while(start < end) {
			int mid = start + (end-start) / 2;
			if(arr[mid] < arr[mid-1]) {
				return mid;
			}
			if(arr[mid] > arr[mid+1]) {
				return mid+1;
			}
			if(arr[start] < arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
