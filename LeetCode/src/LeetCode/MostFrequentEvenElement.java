package LeetCode;

import java.util.HashMap;

public class MostFrequentEvenElement {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 2, 4, 4, 1 };
		System.out.println(mostFrequentEven(arr));

	}

	public static int mostFrequentEven(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int count = 0, currentElement = 0, prevElement = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				count = map.get(arr[i]);
				map.put(arr[i], count);
			}
			
		}
		return -1;
	}
}
