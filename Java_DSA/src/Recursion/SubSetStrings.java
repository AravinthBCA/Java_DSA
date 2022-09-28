package Recursion;

public class SubSetStrings {

	public static void main(String[] args) {
		String unProccessed = "abc";
		subSetForming("",unProccessed);
	}
	
	public static void subSetForming(String proccessed,String unProccessed) {
		if(unProccessed.isEmpty()) {
			System.out.println(proccessed);
			return;
		}
		char ch = unProccessed.charAt(0);
		subSetForming(proccessed + ch, unProccessed.substring(1));
		subSetForming(proccessed, unProccessed.substring(1));
	}

}
