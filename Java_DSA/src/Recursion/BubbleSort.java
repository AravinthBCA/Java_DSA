package Recursion;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		bubbleSort(arr, arr.length-1, 0);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr,int row,int column) {
		if(row == 0) {
			return;
		}
		if(column < row) {
			if(arr[column] > arr[column+1]) {
				int temp = arr[column+1];
				arr[column+1] = arr[column];
				arr[column] = temp;
			}
			bubbleSort(arr,row,column+1);
		}
		else {
			bubbleSort(arr,row-1,0);
		}
	}
	
}

