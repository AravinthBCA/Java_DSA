package LeetCode;

import java.util.Arrays;

/* https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 * Input: mat = 
 * [[1,1,0,0,0], [1,1,1,1,0],[1,0,0,0,0], [1,1,0,0,0], [1,1,1,1,1]], 
 * k = 3
 * Output: [2,0,3]
 * Explanation:  The number of soldiers in each row is: 
 * Row 0: 2, Row 1: 4, Row 2: 1, Row 3: 2, Row 4: 5 
 * The rows ordered from weakest to strongest are [2,0,3,1,4].
 */

public class The_K_Weakest_Rows_in_a_Matrix {

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
		System.out.println(Arrays.toString(kWeakestRows(arr, 3)));
	}

	public static int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];
        for(int i=0; i<mat.length; i++) {
            int count = TotalSoldiers(mat[i]);
            soldiers[i] = count;
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            int minIdx = 0;
            for(int j=0; j<soldiers.length; j++) {
                if(soldiers[j]<soldiers[minIdx]) {
                    minIdx = j;
                }
            }
            res[i] = minIdx;
            soldiers[minIdx] = Integer.MAX_VALUE;
        }
        return res;
        
    }
    public static int TotalSoldiers(int[] arr) {
        int lo = 0;
        int hi = arr.length;
        
        while(lo < hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == 1) {
                lo = mid+1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
