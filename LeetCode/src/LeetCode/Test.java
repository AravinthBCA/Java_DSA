package LeetCode;

public class Test {
	public static void main(String[] args) {
		int arr[] = {2,3,4,7,11};
		System.out.println(findKthPositive(arr, 5));
	}

	public static int findKthPositive(int[] arr, int k) {
		int l = 0, r = arr.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (arr[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
	}
}
