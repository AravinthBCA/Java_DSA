package Bitwise_Operations;

public class FIndNonRepeatedNumber {

	public static void main(String[] args) {
		int arr[] = {2,2,3,2,7,7,8,8,7,8};
		int sum = 0;
		System.out.println(findSolution(arr));
	}

	private static int findSolution(int[] arr) {
		int sum = 0, temp = 1, j = 0;
		while(temp!=0) {
			temp = 0;
			for(int i : arr) {
				temp += (i & ( 1 << j ))==0 ? 0 : 1;
			}
			sum += temp;
			j++;
			System.out.println(temp);
		}
		return sum;
	}

}
