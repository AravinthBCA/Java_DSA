package PatternPrinting;

/* This problem you can imagine four side we have a wall the value inside is minimum distance of four walls,
 * Actual output was 0 0 0 0 0 0 0 0 0 0 0  it was converted into needed output this using  N - previous pattern value
					 0 1 1 1 1 1 1 1 1 1 0 										5 5 5 5 5 5 5 5 5 5 5  
					 0 1 2 2 2 2 2 2 2 1 0 										5 4 4 4 4 4 4 4 4 4 5
					 0 1 2 3 3 3 3 3 2 1 0 										5 4 3 3 3 3 3 3 3 4 5 
					 0 1 2 3 4 4 4 3 2 1 0 										5 4 3 2 2 2 2 2 3 4 5 
					 0 1 2 3 4 5 4 3 2 1 0 										5 4 3 2 1 1 1 2 3 4 5 
					 0 1 2 3 4 4 4 3 2 1 0 										5 4 3 2 1 0 1 2 3 4 5
					 0 1 2 3 3 3 3 3 2 1 0 										5 4 3 2 1 1 1 2 3 4 5
					 0 1 2 2 2 2 2 2 2 1 0 										5 4 3 2 2 2 2 2 3 4 5
					 0 1 1 1 1 1 1 1 1 1 0 								 		5 4 3 3 3 3 3 3 3 4 5
					 0 0 0 0 0 0 0 0 0 0 0 										5 4 4 4 4 4 4 4 4 4 5
					  															5 5 5 5 5 5 5 5 5 5 5
 * to explain how the actual output was formatted first row first column value was 0 because it check all four wall's 
 * distance the minimum distance was left side is 0 so the value was 0. second row second column value is 2 because again 
 * it check all four wall's distance minimum distance was left side wall is 2 so the value was 2. 
 */

public class SquarePatternInDecreasingOrder {

	public static void main(String[] args) {
		int n = 5;
		int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
	}

}
