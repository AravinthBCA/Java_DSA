package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/missing-number/

public class MissingNumber_1 {

	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		System.out.println(Arrays.toString(findMissingNumber(arr).toArray()));
	}
	
	public static List<Integer> findMissingNumber(int arr[]){
		int i=0;
		while(i < arr.length) {
			int correct = arr[i]-1; // pointing to index
			if( arr[i] != arr[correct] ) {
				int temp = arr[correct];
				arr[correct] = arr[i];
				arr[i] = temp;
			}
			else {
				i++;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != j+1) {
				list.add(j+1);
			}
		}
		return list;
	}

}
