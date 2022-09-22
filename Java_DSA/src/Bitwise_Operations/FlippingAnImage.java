package Bitwise_Operations;

import java.util.Arrays;

public class FlippingAnImage {

/* arr[][] = {{1,1,0},{1,0,1},{0,0,0}} first step reverse the array looks like {{0,1,1},{1,0,1},{0,0,0}} then
 * convert 0 to 1 and 1 to 0 final output was {{1,0,0}{0,1,0},{1,1,1}}
 */
	
	public static void main(String[] args) {
		int arr[][] = {{1,1,0},
					   {1,0,1},
					   {0,0,0}};
		solution(arr);	
	}
	public static void solution(int arr[][]) {
		for(int row[] : arr) {
			for(int j=0; j< (row.length+1) / 2; j++) {
				int temp = row[j];
				row[j] = 1 ^ row[row.length - j - 1];
				row[row.length- j - 1] = 1 ^ temp;
			}
		}
		for(int j=0; j<arr.length; j++) {
			System.out.println(Arrays.toString(arr[j]));
		}
	}

}
