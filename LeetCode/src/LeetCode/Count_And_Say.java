package LeetCode;

import java.util.Scanner;

/* 	https://leetcode.com/problems/count-and-say/
	
	Input: n = 1
	Output: "1"
	Explanation: This is the base case.
	
	Input: n = 4
	Output: "1211"
	Explanation:
	countAndSay(1) = "1"
	countAndSay(2) = say "1" = one 1 = "11"
	countAndSay(3) = say "11" = two 1's = "21"
	countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
*/

public class Count_And_Say {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the interger : ");
		int number = in.nextInt();
		System.out.println("Result : "+countAndSay(number));
	}
	
	public static String countAndSay(int number) {
		System.out.println("1");
		int value = 1,count=1;
		String str = "", temp = "1";
		while(number>1) {
			count = 1;
			str = temp;
			temp = "";
			for (int i = 1; i < str.length(); i++) {
				if(str.charAt(i) == str.charAt(i-1)) {
					count++;
				}
				else {
					temp += ""+count+str.charAt(i-1);
					count = 1;
				}
			}
			temp += ""+count+str.charAt(str.length()-1);
			System.out.println(temp);
			number--;
		}
		return temp;
	}
	
}



























