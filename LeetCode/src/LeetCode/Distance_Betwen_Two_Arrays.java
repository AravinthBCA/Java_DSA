package LeetCode;

// https://leetcode.com/problems/find-the-distance-value-between-two-arrays/

public class Distance_Betwen_Two_Arrays {
	public static void main(String[] args) {
		int arr1[] = {1,4,2,3};
		int arr2[] = {-4,-3,6,10,20,30};
		System.out.println(findTheDistanceValue(arr1,arr2,3));
	}
	
	 public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
	        int count = 0;
	        boolean flag = true;
	        for(int i=0; i<arr1.length; i++){
	            flag = true;
	            for(int j=0; j<arr2.length; j++){
	                if(Math.abs(arr2[j] - arr1[i]) > d ){
	                    continue;
	                }
	                else{
	                    flag = false;
	                    break;
	                }
	            }
	            if(flag){
	                count++;
	            }
	        }
	        return count;
	    }
}
