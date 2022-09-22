package Bitwise_Operations;

/* problem => find the non-duplicate element in the array.
 * we are using XOR bitwise operator to find the solution.
 * XOR bitwise operator form was  0 ^ 0 = 0, 1 ^ 1 = 0, 1 ^ 0 = 1, 0 ^ 1 = 1.
 * so if you apply XOR in the array means if all element appears twice in the array means return 0 otherwise it return 
 * single time present element only.
 */

public class Find_Non_DuplicateElement {
	public static void main(String[] args) {
		int arr[] = {2,3,4,1,2,1,3,6,4};
		System.out.println(findElement(arr));
	}

	private static int findElement(int[] arr) {
		int unique = 0;
		for(int i : arr) {
			unique ^= i;
		}
		return unique;
	}
	
	
}
