package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationString {

	public static void main(String[] args) {
		String str = "ab";
		System.out.println(permutationCount("",str));
		System.out.println(Arrays.toString(permutationList("",str).toArray()));
	}
	
	public static void permutation(String p, String unp) {
		if(unp.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = unp.charAt(0);
		for(int i=0; i<=p.length(); i++) {
			String s = p.substring(0,i);
			String f = p.substring(i,p.length());
			permutation(f+ch+s, unp.substring(1));
		}
	}
	
	public static ArrayList<String> permutationList(String p, String unp) {
		if(unp.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> all = new ArrayList<String>();
		
		char ch = unp.charAt(0);
		for(int i=0; i<=p.length(); i++) {
			String s = p.substring(0,i);
			String f = p.substring(i,p.length());
			all.addAll(permutationList(s+ch+f, unp.substring(1)));
		}
		
		return all;
	}
	
	public static int permutationCount(String p, String unp) {
		if(unp.isEmpty()) {
			return 1;
		}
		int count = 0;
		char ch = unp.charAt(0);
		for(int i=0; i<=p.length(); i++) {
			String s = p.substring(0,i);
			String f = p.substring(i,p.length());
			count += permutationCount(s+ch+f, unp.substring(1));
		}
		
		return count;
	}

}
