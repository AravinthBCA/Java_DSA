package Binary_Search;

import java.util.Arrays;

// search the target in 2d matrix, it's sorted in row and column wise

public class Matrix2D_Row_Column_Sorted {
	public static void main(String args[]) {
//		int arr[][] = { {10,20,30,40},
//					  	{15,25,35,45},
//					  	{28,29,37,49},
//					  	{33,34,38,50}	};
		int arr[][] = {{1,3}};
		int target = 3;
		System.out.println(Arrays.toString(findElement(arr,target)));
	}
	
/* the matrix is sorted in row and column wise ok.
 * example => arr[0][0] element is less than of arr[0][n-1] and arr[n-1][0].
 * starting row index is 0 and column index is n-1, the program will check arr[0][n-1] is equal to target or not, 
 * if equal means the return the index otherwise will check the element is less than of target or greater than of target, 
 * if element is less than the target means left side of element also smaller than the target so you can skip current row 
 * and increase the row++.
 * if element is greater than the target means your target element must present left side of the array only so you can skip 
 * the current column and increase the column++... 
*/
	
	public static int[] findElement(int arr[][], int target) {
		int row = 0, col = arr[0].length-1;
		while(row < arr.length && col >= 0) {
			if(arr[row][col] == target) {
				return new int[] {row,col};
			}
			if(arr[row][col] < target) {
				row++;
			}
			else {
				col--;
			}
		}
		return new int[] {-1,-1};
	}
}
