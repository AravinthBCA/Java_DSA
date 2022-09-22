import java.util.Arrays;

class ArrayCallByValue {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b=1;
		System.out.println(Arrays.toString(a));
		change(a);
		System.out.println(Arrays.toString(a));
		change("aravinth");
	} 
	// the data was change only non-primitive datatype like arr it not support int,char,string and others.
	static void change(int num[]) { 
		num[0]=99;
	}
	static void change(String name) { 
	}
}
