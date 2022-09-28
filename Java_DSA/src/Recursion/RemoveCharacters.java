package Recursion;

// intput = baccad remove = a

public class RemoveCharacters {
	public static void main(String[] args) {
		String str = "baccad";
		StringBuilder ans = new StringBuilder();
		skip("",str);
		str = "baccad"; 
		System.out.println("Output 2 : "+removeCharacter(str, ans, 0));
	}
	
	// solution 1
	public static StringBuilder removeCharacter(String str, StringBuilder answer, int i) {
		if(str.length() == i) {
			return answer;
		}
		if(str.charAt(i) != 'a') {
			answer.append(str.charAt(i));
		}
		return removeCharacter(str,answer,i+1);
	}
	
	// solution 2
	public static void skip(String processed, String unProcessed) {
		if(unProcessed.isEmpty()) {
			System.out.println("Output 1 : "+processed);
			return;
		}
		char ch = unProcessed.charAt(0);
		if(ch == 'a') {
			skip(processed,unProcessed.substring(1));
		}
		else {
			processed+=ch;
			skip(processed,unProcessed.substring(1));
		}
	}
}
