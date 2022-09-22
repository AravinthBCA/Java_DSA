package LeetCode;
import java.util.Scanner;

/* https://leetcode.com/problems/roman-to-integer/
	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
	
	Input: s = "III"
	Output : 3
	Explanation: III = 3.
	
	Input: s = "LVIII"
	Output: 58
	Explanation: L = 50, V= 5, III = 3.
	
*/

public class Roman_To_Integer {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input : ");
		String s = in.next();
		int ans = 0;
		for(int i=0; i<s.length(); i++) {
        	int value = romanToInt(s.charAt(i));
        	if(i < s.length()-1 && value < romanToInt(s.charAt(i+1))) {
        		ans -= value;
        	}
        	else {
        		ans += value;
        	}
        }
		System.out.println(ans);
	}
	
	public static int romanToInt(char c) {
		int value = 0;
		switch(c) {
			case 'I':
				value += 1;
				break;
			case 'V': 
				value += 5;
				break;
			case 'X':
				value += 10;
				break;
			case 'L':
				value += 50;
				break;
			case 'C':
				value += 100;
				break;
			case 'D':
				value += 500;
				break;
			case 'M':
				value += 1000;
				break;
			default:
				break;
		}
		return value;
    }
	
}
