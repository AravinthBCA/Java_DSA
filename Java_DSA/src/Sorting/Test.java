package Sorting;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int arr[] = {-2,3,-5};
		mergeSorting(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
    public static void mergeSorting(int arr[], int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = (start + end) / 2;
        System.out.println(mid);
        mergeSorting(arr, start, mid);
        mergeSorting(arr, mid, end);
        
        sorting(arr, start, mid, end);
    }
    
    public static void sorting(int arr[], int start, int mid, int end){
        int i = start, j = mid, k = 0;
        int elements[] = new int[end-start];
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                elements[k] = arr[i];
                i++;
            }
            else{
                elements[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            elements[k] = arr[i];
            i++; k++;
        }
        while(j < mid){
            elements[k] = arr[j];
            j++; k++;
        }
        for(int l=0; l<elements.length; l++){
            arr[start+l] = elements[l];
        }
    }
}
