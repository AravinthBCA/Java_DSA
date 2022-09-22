package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = {1,1,2};
		System.out.println(Arrays.toString(findDuplicate(arr).toArray()));
	}
	
	public static List<Integer> findDuplicate(int[] arr) {
		int i=0;
        List<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			int correct = arr[i]-1; // pointing to index
			if(arr[i] == arr[correct] && i != correct && i > correct){
                list.add(arr[i]);
            }
            if( arr[i] != arr[correct]) {
				int temp = arr[correct];
				arr[correct] = arr[i];
				arr[i] = temp;
			}
            else{
                i++;
            }
		}
        return list;
    }
}
