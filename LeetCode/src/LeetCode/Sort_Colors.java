package LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/

public class Sort_Colors {
	public static void main(String[] args) {
		int arr[] = { 2, 0, 2, 1, 1, 0 };
		int start = 0, end = arr.length - 1, i = 0;
		while (i <= end) {
			if (arr[i] == 0) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
			} else if (arr[i] == 2) {
				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
				end--;
				continue;
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
