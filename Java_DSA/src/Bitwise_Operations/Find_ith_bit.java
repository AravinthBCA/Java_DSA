package Bitwise_Operations;

/* problem => input is 10110110 return the ith digit of number.
 * ith is 5th means expected result is 1 if ith is 4th means expected result is 0.
 * The ith count was start from right to left.
 * If we need first bit means we can simply AND 1 with first bit it return first bit because of AND 1 with any other 
   it return that number only. example 0001 AND 1 means result is 1.
 * If we want to find any ith bit means you want to create the bits like is ( 00010000 ) and AND with original bits means
   you get the ith bit digit. How the mask ( 00010000 ) was created means initially it was 0001 decimal 1 then which digit
   you want find with subtract 1 and apply left shift operator you will get the mask.
   ( 1 << i - 1 ) returns 00010000 i means 5. 
 */

public class Find_ith_bit {

	public static void main(String[] args) {
		// if the ith digit is other than that 0 zero means it return digit > 0 any number.
		// if the ith digit is zero it return 0.
		System.out.println( 7 & ( 1 << ( 4 - 1 )));
	}

}
