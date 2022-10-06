package LeetCode;

/* https://leetcode.com/problems/sum-of-square-numbers/submissions/
 * Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
 * Input: c = 5
 * Output: true
 * Explanation: 1 * 1 + 2 * 2 = 5
 */

public class Sum_of_Square_Numbers {

	public static void main(String[] args) {
		System.out.println(judgeSquareSum(5));
	}
	
	// solution 1
	public static boolean judgeSquareSum(int c) {
        long start=0;
        long end=(long)Math.sqrt(c);
        while(start<=end){
             long sum=start*start+end*end;
             if(sum==c) return true;
             else if(sum>c) end--;
             else start++;
        }
        return false;
    }
	
	// solution 2
	public static boolean judgeSquareSum1(int c) {
        for(long i=0;i*i<=c;i++){
            int target=c-(int)(i*i);
            if(bs(target)) return true;
        }
        return false;
    }
    public static boolean bs(int target){
        long start=0;
        long end=target;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==target) return true;
            if(mid*mid>target) end=mid-1;
            else start=mid+1;
       }
       return false;
    }
}
