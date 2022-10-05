package LeetCode;

/* https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
   return the number of negative numbers in grid
   Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
   Output: 8
   Explanation: There are 8 negatives number in the matrix.
   
   Example 2:
   Input: grid = [[3,2],[1,0]]
   Output: 0
 */

public class Count_Negative_Numbers_Sorted_Matrix {

	public static void main(String[] args) {
		int grid[][] = {{3,2},{1,0}};
		System.out.println(countNegatives(grid));
	}
	
	public static int countNegatives(int[][] grid) {
        int count = 0;
        for(int arr[] : grid){
            count += binarySearch(arr);
        }
        return count;
    }
    
    public static int binarySearch(int arr[]){
    	int start = 0, end = arr.length;
    	while(start < end) {
    		int mid = start + (end - start) / 2;
    		if(arr[mid] < 0) {
    			end = mid;
    		}
    		else {
    			start = mid + 1;
    		}
    	}
    	return Math.abs(end-arr.length);
    }

}
