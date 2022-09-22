package Binary_Search;

public class Binary_Search_Recursion {

	public static void main(String[] args) {
		int arr[] = {1,3,5,6,7,8,10};
		System.out.println(search(arr,11,0,arr.length-1));
	}
	
	public static int search(int arr[], int target,int start,int end) {
		if(start > end) {
			return -1;
		}
		int mid = start + (end - start)/2;
		if(arr[mid] == target) {
			return mid;
		}
		if(arr[mid] > target) {
			return search(arr,target,start,mid-1);
		}
		else {
			return search(arr,target,mid+1,end);
		}
	}

}
