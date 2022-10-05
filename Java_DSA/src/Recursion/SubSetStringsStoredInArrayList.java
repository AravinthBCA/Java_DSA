package Recursion;

import java.util.ArrayList;

public class SubSetStringsStoredInArrayList {

	public static void main(String[] args) {
		System.out.println(subSetArrayList("","abc").toString());
	}
	
	public static ArrayList<String> subSetArrayList(String proccessed,String unProccessed) {
		if(unProccessed.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(proccessed);
			return list;
		}
		char ch = unProccessed.charAt(0);
		ArrayList<String> left = subSetArrayList(proccessed + ch, unProccessed.substring(1));
		ArrayList<String> right = subSetArrayList(proccessed, unProccessed.substring(1));
		
		left.addAll(right);
		return left;
	}	
}
