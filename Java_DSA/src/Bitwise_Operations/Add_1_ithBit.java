package Bitwise_Operations;

/* problem => add 1 to the any bit in the given number.
 * input was decimal 1 binary form was 0001 and ith bit was 3 so it add 1 to the 3rd bit it becomes 0101.
 * how we can achieve the solution means using mask and OR bitwise operator.
 * mask was 0100. apply OR operator 0001 | 0100 -> 0101
 * the mask was created by using left shift operator, initially the mask was 0001 decimal 1 and it left shift with our ith
 * digit( 3 ) - 1 you get needed mask ( 000100 ). 
 */

public class Add_1_ithBit {

	public static void main(String[] args) {
		// 1 is input and 3 is ith digit.
		System.out.println( 1 | ( 1 << ( 3 - 1 )));
		
		System.out.println(6 & ( -6 ));
	}

}
