package LeetCode.Math;

public class Test {

	public static void main(String[] args) {
		String s = "ab", t = "baab	";
		System.out.println(solution(s,t,-1));
	}
	
	public static boolean solution(String s, String t, int index) {
		for(int i=0; !s.isEmpty(); i++) {
			int temp = t.indexOf(s.charAt(0));
			if(index < temp) {
				s = s.substring(1);
				index = temp;
			}
			else {
				return false;
			}
		}
		return true;		
	}

}
