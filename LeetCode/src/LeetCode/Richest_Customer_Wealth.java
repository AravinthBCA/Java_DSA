package LeetCode;

import java.util.Scanner;

/*	https://leetcode.com/problems/richest-customer-wealth/
 	
 	Input: accounts = [[1,2,3],[3,2,1]]
	Output: 6
	Explanation:
	1st customer has wealth = 1 + 2 + 3 = 6
	2nd customer has wealth = 3 + 2 + 1 = 6
	Both customers are considered the richest with a wealth of 6 each, so return 6.
	
	Input: accounts = [[1,5],[7,3],[3,5]]
	Output: 10
	Explanation: 
	1st customer has wealth = 6
	2nd customer has wealth = 10 
	3rd customer has wealth = 8
	The 2nd customer is the richest with a wealth of 10.

 */

public class Richest_Customer_Wealth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the customer count and bank count : ");
		int customer = in.nextInt(), bank = in.nextInt();
		int arr[][] = new int[customer][bank];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < bank; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.println(maximumWealth(arr));
	}
	
	public static int maximumWealth(int[][] accounts) {
		int maxValue = 0;
		for (int i = 0; i < accounts.length; i++) {
			int value = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				value += accounts[i][j];
				
			}
			if(value > maxValue) {
				maxValue = value;
			}
		}
        return maxValue;
	}
}
