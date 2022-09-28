package LeetCode;

public class PeakIndexMountain {

	public static void main(String[] args) {
		int arr[] = {0,1,0};
		System.out.println(peakIndexInMountainArray(arr));
	}
	
	public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length;
        while(start < end){
            int mid = start + ( end - start ) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] < arr[mid-1]) {
            	end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }

}
