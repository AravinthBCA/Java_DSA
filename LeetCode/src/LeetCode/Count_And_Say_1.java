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

public class Count_And_Say_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the interger : ");
		int number = in.nextInt();
		System.out.println("Result : "+countAndSay(number));
	}
	
	public static String countAndSay(int n) {
		if (n == 1) return "1";

        StringBuilder cur = new StringBuilder();
        String prev = countAndSay(n - 1);
        int count = 0;

        for (int i = 0; i < prev.length(); i++) {
            count++;

            if (i == prev.length() - 1 || prev.charAt(i) != prev.charAt(i + 1)) {
                cur.append(count).append(prev.charAt(i));
                count = 0;
            }
        }

        return cur.toString();
	}
	
}



























