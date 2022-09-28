package LeetCode;

/* https://leetcode.com/problems/maximum-average-subarray-i/
   You are given an integer array nums consisting of n elements, and an integer k.
   Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
   Any answer with a calculation error less than 10-5 will be accepted.
*/

public class MaximumAverageSubArray {

	public static void main(String[] args) {
		int arr[] = {0,4,0,3,2};
		System.out.println(findMaxAverage(arr,1));
		
	}
	
	 public static double findMaxAverage(int[] nums, int k) {
		 int sum = 0;
	        for(int i = 0; i < k; i++) {
	            sum += nums[i];
	        }
	        
	        int maxSum = sum;
	        for(int i = 0, j = k; j < nums.length; i++, j++) {
	            sum = sum - nums[i] + nums[j];
	            maxSum = Math.max(sum, maxSum);
	        }
	        
	        return ((double) maxSum) / ((double) k);
	 }

}
