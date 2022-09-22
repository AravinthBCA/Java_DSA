package LeetCode;
import java.util.Arrays;
import java.util.Scanner;

/* https://leetcode.com/problems/two-sum/

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]
 
*/


public class Two_Sum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array : ");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the target element: ");
		System.out.println(Arrays.toString(twoSum(arr,in.nextInt())));
	}
	
	public static int[] twoSum(int[] arr, int target) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					return new int[] {i,j};
				}
			}
		}
        return new int[] {};
    }
}
