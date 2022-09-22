package Sorting;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {
		int arr[] = {5,3,1,2,4};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println((int)Math.cbrt(16));
		System.out.println(Integer.MAX_VALUE);
		System.out.println((int)Math.pow(2, 30));
	}
	
	public static void insertionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				else {
					break;
				}
			}
		}
	}

}
