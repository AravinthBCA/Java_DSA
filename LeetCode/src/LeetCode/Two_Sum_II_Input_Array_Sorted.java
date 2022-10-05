package LeetCode;

import java.util.Arrays;

/* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Input: numbers = [2,7,11,15], target = 9
   Output: [1,2] add one to the resultant index 
   Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
   Input: numbers = [0,0,3,4], target = 0
   Output: [1,2]
 */

public class Two_Sum_II_Input_Array_Sorted {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,4,9,56,90};
		System.out.println(Arrays.toString(twoSum(arr,8)));
	}

	public static int[] twoSum(int[] arr, int target) {
		for (int i = 0; i < arr.length; ++i) {
            int low = i+1;
			int high = arr.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (arr[mid] == target - arr[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (arr[mid] > target - arr[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
	}
}
