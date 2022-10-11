package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze_With_Obstacles_Find_Ways_To_Reach_Destination {

	public static void main(String[] args) {
		
		boolean[][] maze = {{true,true,true},
						  {true,true,true},
						  {true,true,true}};
		int arr[][] = new int[3][3];
		
		System.out.println("\nPaths : " + Arrays.toString(printingPathsAllDirectionWithMatrix(maze,"",0,0, arr, 1).toArray()));
	}	
	
	public static List<String> printingPathsDownRight(boolean maze[][], String processed, int row, int column) {
		if(maze[row][column]) {
			if(row == 2 && column == 2) {
				ArrayList<String> innerList = new ArrayList<>();
				innerList.add(processed);
				return innerList;
			}
		}
		else {
			return new ArrayList<>();
		}
		
		ArrayList<String> outerList = new ArrayList<>();
		
		if(row < 2) {
			outerList.addAll(printingPathsDownRight(maze,processed+"D", row+1, column));
		}
		if(column < 2) {
			outerList.addAll(printingPathsDownRight(maze,processed+"R", row, column+1));
		}
		return outerList;
	}
	
	public static List<String> printingPathsAllDirection(boolean maze[][], String processed, int row, int column) {
		if(maze[row][column]) {
			if(row == 2 && column == 2) {
				ArrayList<String> innerList = new ArrayList<>();
				innerList.add(processed);
				return innerList;
			}
		}
		else {
			return new ArrayList<>();
		}
		
		ArrayList<String> outerList = new ArrayList<>();
		// set as false because this cell is visited
		maze[row][column] = false;
		
		if(row < 2) {
			outerList.addAll(printingPathsAllDirection(maze,processed+"D", row+1, column));
		}
		if(column < 2) {
			outerList.addAll(printingPathsAllDirection(maze,processed+"R", row, column+1));
		}
		if(row > 0) {
			outerList.addAll(printingPathsAllDirection(maze,processed+"U", row-1, column));
		}
		if(column > 0) {
			outerList.addAll(printingPathsAllDirection(maze,processed+"L", row, column-1));
		}
		// revert the changes, because next recursion call need initial behavior of array otherwise first recursion call visited cells
		// is also consider the second recursion call is visited.
		maze[row][column] = true;
		return outerList;
	}
	
	public static List<String> printingPathsAllDirectionWithMatrix(boolean maze[][], String processed, int row, int column, int arr[][], int level) {
		if(maze[row][column]) {
			if(row == 2 && column == 2) {
				arr[row][column] = level;
				for (int[] i : arr) {
					System.out.println(Arrays.toString(i));
				}
				System.out.println("Directions : "+processed);
				System.out.println("----------------------------------------------------");
				ArrayList<String> innerList = new ArrayList<>();
				innerList.add(processed);
				return innerList;
			}
		}
		else {
			return new ArrayList<>();
		}
		
		ArrayList<String> outerList = new ArrayList<>();
		// set as false because this cell is visited
		maze[row][column] = false;
		arr[row][column] = level;
		if(row < 2) {
			outerList.addAll(printingPathsAllDirectionWithMatrix(maze,processed+"D", row+1, column, arr, level+1));
		}
		if(column < 2) {
			outerList.addAll(printingPathsAllDirectionWithMatrix(maze,processed+"R", row, column+1, arr, level+1));
		}
		if(row > 0) {
			outerList.addAll(printingPathsAllDirectionWithMatrix(maze,processed+"U", row-1, column, arr, level+1));
		}
		if(column > 0) {
			outerList.addAll(printingPathsAllDirectionWithMatrix(maze,processed+"L", row, column-1, arr, level+1));
		}
		// revert the changes, because next recursion call need initial behavior of array otherwise first recursion call visited cells
		// is also consider the second recursion call is visited.
		maze[row][column] = true;
		arr[row][column] = 0;
		return outerList;
	}

}
