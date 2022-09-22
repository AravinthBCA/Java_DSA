package Binary_Search;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

/* Find the first and last index of the target element occurrence in the arrya */

public class FindFirst_LastPositionofElement {
	public static void main(String[] args) {
		int arr[] = { 1,2,3,5,5,7,8,8};
		int target = 5;
		System.out.println(Arrays.toString(searching(arr,target)));
	}
	
	static int[] searching(int arr[],int target) {
		int ans[] = {-1,-1};
		ans[0] = findFindLastIndex(arr,target,true);
		ans[1] = findFindLastIndex(arr,target,false);
		return ans;
	}
	
	static int findFindLastIndex(int arr[],int target, boolean findStartIndex){
		int start = 0, end = arr.length-1, ans = 0;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(arr[mid] > target) {
				end = mid-1;
			}
			else if(arr[mid] <  target) {
				start = mid+1;
			}
			else {
				ans = mid;
				if(findStartIndex) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
		return ans;
	}
}
