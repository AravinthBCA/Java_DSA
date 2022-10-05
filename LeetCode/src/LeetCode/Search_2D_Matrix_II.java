package LeetCode;

/* https://leetcode.com/problems/search-a-2d-matrix-ii/
 */

public class Search_2D_Matrix_II {

	public static void main(String[] args) {
		int grid[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
	}
	
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

}
