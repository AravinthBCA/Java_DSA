package Binary_Search;

/* ceiling number means find the element in the array is greater or= target.
 * arr = [ 2,3,5,9,14,16,18]; target is 14 means ceiling number is 14, target is 15 means 
 * 16 is the ceiling number, target is 4 means 5 is the ceiling number, target is 9 means
 * 9 is the ceiling number.
 * First step you get the target then check your array have the target element is available or not if available that is your 
 * ceiling number otherwise start position is your ceiling because the target is not found so we need next large element of
 * of target so current start position have that, it happen when the while was break start <= end
*/

public class Ceiling_Number {
	public static void main(String[] args) {
		int arr[] = { 2,3,4,9,14,16,18};
		int target = 15;
		System.out.println(findCeilingNumber(arr,target));
	}

	static int findCeilingNumber(int arr[],int target) {
		int start = 0,end =  arr.length-1;
		if(target > arr[end]) {
			return -1;
		}
		while(start <= end) {
			int middle = start + (end - start)/2;
			if(arr[middle] > target) {
				end = middle - 1;
			}
			else if(arr[middle] < target){
				start = middle + 1;
			}
			else {
				return middle;
			}
		}
		return start;
	}
	
}
