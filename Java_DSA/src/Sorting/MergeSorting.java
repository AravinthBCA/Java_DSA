package Sorting;

import java.util.Arrays;

public class MergeSorting {

	public static void main(String[] args) {
		int arr[] = {3,1,5,2,4,6};
		mergeSorting(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSorting(int arr[],int start,int end) {
		if(end - start == 1) {
			return;
		}
		int mid = (start + end) / 2;
		
		mergeSorting(arr, start, mid);
		mergeSorting(arr, mid, end);
		
		sorting(arr, start , mid, end);
	}
	
	public static void sorting(int arr[], int start, int mid, int end) {
		int max[] = new int[end-start];
		int i = start, j = mid, k = 0;
		while(i < mid && j < end) {
			if(arr[i] < arr[j]) {
				max[k] = arr[i];
				i++;
			}
			else {
				max[k] = arr[j];
				j++;
			}
			k++;
		}
		while(i < mid) {
			max[k] = arr[i];
			i++; k++;
		}
		while(j < end) {
			max[k] = arr[j];
			j++; k++;
		}
		for(int g=0; g<max.length; g++) {
			arr[start+g] = max[g];
		}
	}

}
