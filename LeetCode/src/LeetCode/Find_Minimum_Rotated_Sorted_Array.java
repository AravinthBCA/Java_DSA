package LeetCode;

/* https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */

public class Find_Minimum_Rotated_Sorted_Array {

	public static void main(String[] args) {
		int arr[] = {1,2};
		System.out.println(findMin(arr));
	}
	
	public static int findMin(int[] arr) {
		if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[start] <= arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }		

}
