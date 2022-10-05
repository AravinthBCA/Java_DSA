package LeetCode;

public class Find_Minimum_Rotated_Sorted_Array {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		System.out.println(findMin(arr));
	}
	
	public static int findMin(int[] arr) {
        return binarySearch(arr, 0, arr.length-1);
    }
	
	public static int binarySearch(int arr[], int start, int end) {
		int mid = start + (end-start) / 2;
		if(arr[mid] < arr[mid+1] && arr[mid] < arr[mid-1]) {
			return mid;
		}
		if(arr[start] < arr[mid]) {
			return binarySearch(arr, mid+1, end);
		}
		else {
			return binarySearch(arr, start, mid-1);
		}
	}

}
