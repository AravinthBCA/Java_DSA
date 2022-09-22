package Binary_Search;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
/* mountain array means the array looks increasing order in first part and decreasing order in second part
 * arr[] = {1,2,3,4,5,2,1} we need to find the largest element in the array this result is -> 5 
 */

// Note => any order doesn't contain the duplicate elements means in increasing order doesn't contain the duplicate element
// and decreasing order also doesn't contain the duplicate element, same element present in both orders it allow.

public class PeakIndexMountainArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,8,3,2,1};
		System.out.println(binearySearch(arr));
	}
	
	static int binearySearch(int arr[]) {
		int start = 0, end = arr.length-1;
		while(start < end) {
			int mid = start + ( end - start ) / 2;
			if(arr[mid] > arr[mid+1]) {
//				if mid > mid+1 means you are in decreasing order so you need check the left side part
//				may be current mid element is largest element but we need check left side also
				end = mid;
			}
			else {
//				loop comes else part means the mid+1 element greater that mid element so we need check further right side part
				start = mid + 1;
			}
		}
		// in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
		return start;
	}
}
