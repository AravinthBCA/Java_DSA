package Recursion;

import java.util.ArrayList;

public class ArrayElementsSubSequence {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		ArrayList<ArrayList<Integer>> ans = subSet(arr);
		for(ArrayList<Integer> list : ans) {
			System.out.println(list.toString());
		}
	}
	
	public static ArrayList<ArrayList<Integer>> subSet(int arr[]){
		ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<>());
		
		for(int num : arr) {
			int n = outer.size();
			for(int i=0; i<n; i++) {
				ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		return outer;
	}

}
