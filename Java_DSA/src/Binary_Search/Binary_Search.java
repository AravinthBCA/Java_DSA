package Binary_Search;

public class Binary_Search {
	public static void main(String[] args) {
		int asc[] = {-50,-10,-1,0,1,5,8,13,21};
		int des[] = {50,10,1,0,-1,-5,-8,-13,-21};
		System.out.println(binarySearch(asc,8));
		System.out.println(binarySearch(des,1));
	}
	
	static int binarySearch(int arr[],int target) {
		
		int start = 0, end = arr.length-1;
//		to find the array was ascending or descending order
		boolean ascen = arr[start] < arr[end];
		
		while(start <= end) {
//			int mid = (start + end) /2; // might be possible that ( start+end ) exceeds the range of integer
			int mid = start + (end-start)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(ascen) {
				if(arr[mid] < target) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
			else {
				if(arr[mid] < target) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
		}
		return -1;
	}
}
