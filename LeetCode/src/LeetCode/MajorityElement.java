package LeetCode;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}
	
	public static int majorityElement(int[] arr) {
        int count = 1, element = arr[0], i = 1;
        while(i < arr.length){
            if(count == 0){
                element = arr[i];
                count++;
            }
            else if(arr[i] == element){
                count++;
            }
            else{
                count--;
            }
            i++;
        }
        return element;
    }

}
