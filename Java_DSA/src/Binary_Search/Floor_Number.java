package Binary_Search;

/* Floor of a number means find the element in the array is smaller or= target.
 * arr = [ 2,3,4,9,14,16,18]; target is 14 means ceiling number is 14, target is 5 means 4 is the ceiling number, 
 * target is 9 means 8 is the ceiling number...
 * First step you get the target then check your array have the target element is available or not if available that is 
 * your ceiling number otherwise end position is your ceiling because the target is not found so we need find next 
 * smallest element of target current end position have the element is smaller than of target element,it happen when the while 
 * was break start <= end
*/

public class Floor_Number {
	public static void main(String[] args) {
		int arr[] = { 2,3,4,9,14,16,18};
		int target = 4;
		System.out.println(findCeilingNumber(arr,target));
	}

	static int findCeilingNumber(int arr[],int target) {
		int start = 0,end =  arr.length-1;
		while(start <= end) {
			int middle = start + (end - start)/2;
			if(arr[middle] > target) {
				end = middle - 1;
			}
			else {
				start = middle + 1;
			}
		}
		return end;
	}
	
}
