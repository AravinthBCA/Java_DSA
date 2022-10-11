package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze_Find_Ways_To_Reach_Destination {

	public static void main(String[] args) {
		System.out.println("Number of ways to reach the destination : "+numberOfWays(3,3));
		
		System.out.println("\nPaths : " + Arrays.toString(printingPaths("",3,3).toArray()));
		
		System.out.println("\nPaths : " + Arrays.toString(printingPathsDiagonally("",3,3).toArray()));
	}
	
	public static int numberOfWays(int row, int column) {
		if(row == 1 || column == 1)
			return 1;
		
		int left = numberOfWays(row-1, column);
		int right = numberOfWays(row, column-1);
		
		return left + right;
	}
	
	public static List<String> printingPaths(String processed, int row, int column) {
		if(row == 1 && column == 1) {
			ArrayList<String> innerList = new ArrayList<>();
			innerList.add(processed);
			return innerList;
		}
		
		ArrayList<String> outerList = new ArrayList<>();
		
		if(row > 1) {
			outerList.addAll(printingPaths(processed+"D", row-1, column));
		}
		if(column > 1) {
			outerList.addAll(printingPaths(processed+"R", row, column-1));
		}
		return outerList;
	}
	
	public static List<String> printingPathsDiagonally(String processed, int row, int column) {
		if(row == 1 && column == 1) {
			ArrayList<String> innerList = new ArrayList<>();
			innerList.add(processed);
			return innerList;
		}
		
		ArrayList<String> outerList = new ArrayList<>();
		
		if(row > 1) {
			outerList.addAll(printingPathsDiagonally(processed+"V", row-1, column));
		}
		if(column > 1) {
			outerList.addAll(printingPathsDiagonally(processed+"H", row, column-1));
		}
		if(row > 1 && column > 1) {
			outerList.addAll(printingPathsDiagonally(processed+"D", row-1, column-1));
		}
		return outerList;
	}

}
