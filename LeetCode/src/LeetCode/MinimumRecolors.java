package LeetCode;

// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/

public class MinimumRecolors {

	public static void main(String[] args) {
		String blocks = "BWBBWWBBBWBWWWBWWBBWBWBBWBB";
		int k = 11;
		System.out.println(minimumRecolors(blocks,k));
	}
	
	public static int minimumRecolors(String blocks, int k) {
		int blackCount = 0;
		for(int i=0; i<k; i++) {
			if(blocks.charAt(i) == 'B') {
				blackCount++;
			}
		}
		int minSum = k -  blackCount, sum = minSum;
		for(int i=0,j=k; j<blocks.length(); j++,i++) {
			if(blocks.charAt(i) == 'W') {
				sum--;
			}
			if(blocks.charAt(j) != 'B') {
				sum++;
			}
			if(sum < minSum) {
				minSum = sum;
			}
		}
        return minSum;
    }

}
