package Recursion;

import java.util.ArrayList;

public class Test {
	static int i = 5;
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		solution(arr);
	}
	
	public static void solution(int arr[]) {
		ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<Integer>());
		for(int num : arr) {
			int size = outer.size();
			for(int i=0; i<size; i++) {
				ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
				inner.add(num);
				outer.add(inner);
			}
		}
		System.out.println(outer.toString());
	}
}
