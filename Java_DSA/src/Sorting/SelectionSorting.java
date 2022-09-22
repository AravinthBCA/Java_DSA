package Sorting;

import java.util.Arrays;

/* Selection Sort Algorithm works like first find the largest element in the array then swap that element into the
 * last index of array and find next largest element in the array then swap that element into the last-1 index in array
 * continue until array index = 1;
 * 
 */


public class SelectionSorting {
	public static void main(String args[]) {
		int arr[] = {5,3,2,1,4};
		selectionSorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSorting(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int last = arr.length-i-1;
			int maxElement = findLargestElement(arr,0,last);
			swapElement(arr,maxElement,last);
		}
	}
	
	public static void swapElement(int arr[],int first,int second) {
		int temp = arr[second];
		arr[second] = arr[first];
		arr[first] = temp;
	}
	
	public static int findLargestElement(int arr[],int start, int end) {
		int maxElement = start;
		for(int i=start; i<=end; i++) {
			if(arr[maxElement] < arr[i]) {
				maxElement = i;
			}
		}
		return maxElement;
	}
}
