package Binary_Search;

import java.util.Scanner;

/* smallest letter means find the element in the array is greater of target.
 * arr = [ 'c', 'd', 'f', 'g' ]; target is 'a' means greater char is 'c', target is d means 'f' is greater char, 
 * target is 'g' means 'c' is the greater char, target is 'f' means 'g' greater char.
 * First step you get the target then check your array have the target element is available or not if available that is your 
 * ceiling number otherwise start position is your ceiling because the target is not found so we need next large element of
 * of target so current start position have that, it happen when the while was break start <= end
*/

public class SmallestLetter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char letters[] = { 'c', 'd', 'f', 'g' };
		char target = in.next().charAt(0);
		System.out.println(findCeilingNumber(letters,target));
	}

	static char findCeilingNumber(char letters[],char target) {
		int start = 0,end =  letters.length-1;
		while(start <= end) {
			int middle = start + (end - start)/2;
			if(letters[middle] > target) {
				end = middle - 1;
			}
			else {
				start = middle + 1;
			}
		}
		return letters[start % letters.length];
	}
	
}
