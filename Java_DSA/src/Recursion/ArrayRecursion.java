package Recursion;
import java.util.ArrayList;

public class ArrayRecursion {
	public static void main(String[] args) {
		int arr[] = {1,3,5,9,3};
		int sort[] = {1,2,3,6};
//		System.out.println(findLargestElement(arr,arr[0],0));
//		System.out.println(checkSortedOrNot(sort, 0));
//		System.out.println(linearSearch(arr, 0,10));
		System.out.println(findAllTarget(arr, 3,0));
	}
	
	public static int findLargestElement(int arr[],int large,int position) {
		if(position == arr.length) {
			return large;
		}
		if(arr[position] > large) {
			large = arr[position];
			return findLargestElement(arr,large,position+1);
		}
		return findLargestElement(arr,large,position+1);
	}
	
	public static boolean checkSortedOrNot(int arr[], int position) {
		if(arr.length-1 == position) {
			return true;
		}
		return arr[position] < arr[position+1] && checkSortedOrNot(arr,position+1);
	}

	public static int linearSearch(int arr[],int position,int target) {
		if(arr.length == position) {
			return -1;
		}
		if(arr[position] == target) {
			return position;
		}
		return linearSearch(arr,position+1,target);
	}

	public static ArrayList<Integer> findAllTarget(int arr[],int target,int index){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		if(arr.length == index) {
			return list;
		}
		
		if(arr[index] == target) {
			list.add(index);
		}
		
		ArrayList<Integer> addAllList = findAllTarget(arr,target,index+1);
		list.addAll(addAllList);
		
		return list;
	}
	
}
