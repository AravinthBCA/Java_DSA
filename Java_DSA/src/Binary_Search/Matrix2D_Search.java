package Binary_Search;

import java.util.Arrays;

// search on target element in the 2d sorted matrix

public class Matrix2D_Search {

	public static void main(String[] args) {
		int arr[][] = { {1 ,2 ,3 ,4 },
						{5 ,6 ,7 ,8 },
						{9 ,10,11,12},
						{13,14,15,16} };
		int target = 17;
		System.out.println(Arrays.toString(findElement(arr,target)));
	}
	
	public static int[] binarySearch(int arr[][], int rStart, int target) {
		int cStart = 0, cEnd = arr[rStart].length-1;
		while(cStart <= cEnd) {
			int mid = cStart + (cEnd - cStart) / 2;
			if(arr[rStart][mid] == target) {
				return new int[] {rStart,mid};
			}
			if(arr[rStart][mid] < target) {
				cStart = mid+1;
			}
			else {
				cEnd = mid-1;
			}
		}
		return new int[] {-1,-1};
	}
	
	public static int[] findElement(int arr[][], int target) {
		int rStart = 0, rEnd = arr.length-1, cMid = (arr.length-1)/2;
		// while loop return 2 rows, the 2 rows may contain the target...
		while(rStart < rEnd-1) {
			int mid = rStart + (rEnd - rStart)/ 2;
			if(arr[mid][cMid] == target) {
				return new int[] {mid,cMid};
			}
			if(arr[mid][cMid] < target) {
				rStart = mid;
			}
			else {
				rEnd = mid;
			}
		}
		// using binary search to search the element in resultant two rows
		if(arr[rStart][arr[rStart].length-1] >= target ) {
			return binarySearch(arr, rStart, target);
		}
		else {
			return binarySearch(arr, rStart+1, target);
		}
	}

}
