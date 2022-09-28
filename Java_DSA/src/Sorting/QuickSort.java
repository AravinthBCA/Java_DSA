package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {-935,438,-935,470,-558,-935,-512,-935,-935,331,222,-935,-935,-682,-295,-734};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int arr[], int low, int high) {
		if(low >= high) {
			return;
		}
		int start = low, end = high, pivot = arr[start + (end - start) / 2];
		while(start <= end) {
			while(arr[start] < pivot) {
				start++;
			}
			while(arr[end] > pivot) {
				end--;
			}
			if(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++; 
				end--;
			}
		}
		// low is 0 and end is pointing to current pivot - 1 position
		quickSort(arr, low, end);
		// start is pointing to current pivot position and high is last index in array
		quickSort(arr, start, high);
	}
}
