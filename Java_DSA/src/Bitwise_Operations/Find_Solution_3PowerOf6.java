package Bitwise_Operations;

public class Find_Solution_3PowerOf6 {

/* base = 3, power = 6 in binary form is 110
 * 3*1 power of 4 * 3*1 power of 2 * 3*0 power of 1 => equal to 3 power of 6
 * for more details refer note
*/
	public static void main(String[] args) {
		int ans = 1, power = 6, base = 3;
		while(power > 0) {
			if((power & 1) == 1) {
				ans *= base;
			}
			base *= base;
			power = power >> 1;
		}
		System.out.println(ans);
		System.out.println(9 & -9);
	}

}
