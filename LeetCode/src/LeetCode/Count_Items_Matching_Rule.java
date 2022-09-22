package LeetCode;

// Count Items Matching a Rule 
// https://leetcode.com/problems/count-items-matching-a-rule/

public class Count_Items_Matching_Rule {

	public static void main(String[] args) {
		int nums[] = {2,1,1,2} ;
		if (nums.length == 0) System.out.println(0);
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i+1] = Math.max(memo[i], memo[i-1] + val);
        }
        System.out.println(memo[nums.length]);
	}
	
}
