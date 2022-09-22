package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

/* https://leetcode.com/problems/running-sum-of-1d-array/
   
   Input: nums = [1,2,3,4]
   Output: [1,3,6,10]
   Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

   Input: nums = [1,1,1,1,1]
   Output: [1,2,3,4,5]
   Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]. 

*/

public class Return_Sum_Of_1dArray {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(runningSum(arr)));
	}
	
	public static  int[] runningSum(int[] nums) {
		int value = 0;
		for (int i = 0; i < nums.length; i++) {
			value += nums[i];
			nums[i] = value;
		}
        return nums;
    }

}
