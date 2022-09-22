package LeetCode;
import java.util.Scanner;

/* https://leetcode.com/problems/integer-to-roman/
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
 
*/


public class Integer_To_Roman {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input : ");
		int num = in.nextInt();
		System.out.println(intToRoman(num));
	}
	
	 public static String intToRoman(int num) {
		 int [] intCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String [] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        
	        StringBuilder sb = new StringBuilder();
	        for(int i= 0; i < intCode.length; i++){
	            while(num >= intCode[i]){
	                sb.append(code[i]);
	                num -= intCode[i];
	            }
	        }
	        return sb.toString();
	 }
	 
}
