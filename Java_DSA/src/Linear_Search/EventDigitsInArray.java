package Linear_Search;

public class EventDigitsInArray {
	
	public static void main(String[] args) {
		int arr[] = { 1,23,4,5,7890};
		System.out.println(evenDigitsCount(arr));
	}
	
	static int evenDigitsCount(int arr[]) {
		int count = 0;
		for (int i : arr) {
			if(((int)Math.log10(i)+1) % 2 ==0){
				count++;
			}
		}
		return count;
	}
}
