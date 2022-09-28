package Recursion;

public class RemoveString {

	public static void main(String[] args) {
		String unProcessed = "abcappledef";
		System.out.println(removeString(unProcessed));
	}
	
	public static String removeString(String unProcessed) {
		if(unProcessed.isEmpty()) {
			return "";
		}
		if(unProcessed.startsWith("apple")) {
			return removeString(unProcessed.substring(5));
		}
		else {
			return unProcessed.charAt(0)+removeString(unProcessed.substring(1));
		}
	}

}
