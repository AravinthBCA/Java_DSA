package Sorting;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int arr[] = {5, 4, 3, 2, 1};
		mergeSorting(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSorting(int arr[],int start ,int end){
		if(end - start == 1) {
			return;
		}
		int mid = ( start + end ) / 2;
		mergeSorting(arr, start, mid);
		mergeSorting(arr, mid, end);
		
		sorting(arr, start, mid, end);
	}
	
	public static void sorting(int arr[], int start, int mid, int end) {
		int i =  start, j = mid, k = 0;
		int max[] = new int[end-start];
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
		for (int l = 0; l < max.length; l++) {
			arr[l+start] = max[l];
		}
		
	}

}
