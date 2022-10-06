package LeetCode.Permutation;

/* https://leetcode.com/problems/permutation-in-string/
 * 
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 * 
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * 
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */

public class Permutation_in_String {

	public static void main(String[] args) {
		String s1 = "abcdxabcde", s2 = "abcdeabcdx";
		System.out.println(checkInclusion(s1,s2));
	}

	public static boolean checkInclusion(String s1, String s2) {
		return permutation("",s1,s2);
	}
	
	public static boolean permutation(String p, String up, String check) {
		if(up.isEmpty()) {
			if(check.contains(p))
				return true;
			else
				return false;
		}
		char ch = up.charAt(0);
		boolean flag = false;
		for(int i=0; i<=p.length(); i++) {
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			if(permutation(first+ch+second , up.substring(1), check)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
