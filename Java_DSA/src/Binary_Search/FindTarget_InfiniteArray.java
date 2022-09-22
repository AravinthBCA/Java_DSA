package Binary_Search;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

/* you have array it contains infinite elements so you don't know the array size you need find the start and end index
 * then searching that target element in the array.
 * solution in binary search we do like divide the array into two parts at last we reach single element same thing  
 * take first and second of array it check if target found means good otherwise multiple the start is (2) and end (5) size 
 * by 2...
 */

public class FindTarget_InfiniteArray {
	public static void main(String[] args) {
//		int arr[] = {1,2,3,5,7,8,9,11,15,18};
//		int target = 15;
		int[] arr = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int target = 100;
		System.out.println(findAnswer(arr,target));
	}
	
	static int findAnswer(int arr[], int target) {
        // first start with a box of size 2
		int start = 0, end = 0 ;
		
		// check the end index value and target value if target values greater means increase the box size
		// it throw arrayoutofbound exception if we need handle use arr.length
		while(target > arr[end]) {
			int temp = end + 1;
			end = end + ( end - start + 1 ) * 2;
			start = temp;
		}
		return binarySearch(arr,target,start,end);
	}
	
	static int binarySearch(int arr[], int target, int start, int end) {
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(arr[mid] > target) {
				end = mid-1;
			}
			else if(arr[mid] <  target) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
