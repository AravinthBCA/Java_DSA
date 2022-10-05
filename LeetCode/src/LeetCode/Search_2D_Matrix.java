package LeetCode;

/* https://leetcode.com/problems/search-a-2d-matrix/
 */

public class Search_2D_Matrix {

	public static void main(String[] args) {
		int grid[][] = {{1,3,5}};
		System.out.println(searchMatrix2(grid, 3));
	}
	
	// solution 1
	public boolean searchMatrix(int[][] arr, int target) {
        int row = 0, col = arr[0].length-1;
		while(row < arr.length && col >= 0) {
			if(arr[row][col] == target) {
				return true;
			}
			if(arr[row][col] < target) {
				row++;
			}
			else {
				col--;
			}
		}
        return false;
    }
	
	// solution 2
	public static boolean searchMatrix2(int[][] matrix, int target) {
		boolean flag = false;
		for(int arr[] : matrix) {
			if(flag) {
				return true;
			}
			if(arr[0] < target && arr[arr.length-1] > target) {
				flag = binarySearch(arr,target);
			}
		}
        return flag ? flag : false;
    }
	
	public static boolean binarySearch(int arr[], int target) {
		int start = 0, end = arr.length;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return true;
			}
			if(arr[mid] > target) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return false;
	}

}
