package PatternPrinting;

public class PatternPrintUsingRecursion {

	public static void main(String[] args) {
		recursion(4,4);
	}
	
	public static void recursion(int row,int column) {
		if(column == 0) {
			return;
		}
		for(int i=0; i<column; i++) {
			System.out.print("* ");
		}
		System.out.println();
		recursion(row-1,column-1);
	}

}
