package Recursion;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		bubbleSort(arr, arr.length-1, 0, 0);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr,int row,int column,int maxElement) {
		if(row == 0) {
			return;
		}
		if(column <= row) {
			if(arr[maxElement] < arr[column]) {
				bubbleSort(arr,row,column+1,column);
			}
			else {
				bubbleSort(arr,row,column+1,maxElement);
			}
		}
		else {
			int temp = arr[row];
			arr[row] = arr[maxElement];
			arr[maxElement] = temp;
			bubbleSort(arr,row-1,0,0);
		}
	}
	
}

