package LeetCode;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = {9,6,4,2,3,5,7,0,1};
		System.out.println(findMissingNumber(arr));
	}
	
	public static int findMissingNumber(int arr[]){
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]; // pointing to index
			if(arr[i] < arr.length && arr[i] != arr[correct]) {
				int temp = arr[correct];
				arr[correct] = arr[i];
				arr[i] = temp;
			}
			else {
				i++;
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != j) {
				return j;
			}
		}
		return arr.length;
	}

}
