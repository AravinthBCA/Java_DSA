package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */

public class PhoneNumberSubSet {

	public static void main(String[] args) {
		String digits = "9";
		letterCombinations(digits);
	}
	
	public static void letterCombinations(String digits) {
        System.out.println(Arrays.toString(subSet(digits,"").toArray()));
    }
	
	public static List<String> subSet(String up, String p) {
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		int digit = (up.charAt(0) - '0')-1; // '0' -> 48 ASCII value 
		ArrayList<String> result = new ArrayList<String>();
		int first = 0, second = 0;
		if(digit == 6 || digit == 8) {
			if(digit == 8){
				first = (digit - 1)*3 + 1;
				second = digit * 3 + 2;
			}
			else {
				first = (digit - 1)*3;
				second = digit * 3+1;
			}
		}
		else if(digit == 7){
			first = (digit - 1)*3 + 1;
			second = digit * 3 + 1;
		}
		else {
			first = (digit - 1)*3;
			second = digit * 3;
		}
		for(int i = first; i<second; i++) {
			char ch = (char)('a' + i);
			result.addAll(subSet(up.substring(1), p+ch));
		}
		return result;
	}

}
