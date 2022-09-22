package Bitwise_Operations;

/* problem => convert ith bit to zero
 * input is decimal 5 binary form was 0101, ith digit is 3 and output was 0001 decimal 1.
 * ~ is called complement convert zero to one, one to zero.
 * first i will get the left shift mask value of ith digit - 1 it return 000100. apply complement in mask 111011.
 * apply AND bitwise operator 0101 & 111011 result was 0001.
 * 
 */

public class Convert_ithBitToZero {

	public static void main(String[] args) {
		// 5 is input and 3 is ith bit.
		System.out.println( 5 & ~( 1 << 3 - 1 ));
		System.out.println(364 & -364);
	}

}
