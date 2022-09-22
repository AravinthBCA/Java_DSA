package LeetCode;

// https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = {2,1,3,4,2};
		System.out.println(findDuplicate(arr));
	}
	
	public static int findDuplicate(int[] arr) {
        int i=0;
		while(i<arr.length) {
			if(arr[i] != i+1) {
				int correct = arr[i]-1; // pointing to index
	            if( arr[i] != arr[correct]) {
					int temp = arr[correct];
					arr[correct] = arr[i];
					arr[i] = temp;
				}
	            else {
	            	return arr[i];
	            }
			}
            else{
                i++;
            }
		}
        return -1;
    }
}
