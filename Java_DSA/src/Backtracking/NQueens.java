package Backtracking;

public class NQueens {

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		System.out.println(queens(board, 0));
	}
	
	private static int queens(boolean[][] board, int row) {
		if(row == board.length) {
			display(board);
			System.out.println();
			return 1;
		}
		
		int count = 0;
		for(int col = 0; col < board.length; col++) {
			if(safeQueen(board,row,col)) {
				board[row][col] = true;
				count += queens(board,row+1);
				board[row][col] = false;
			}
		}
		return count;
	}
	
	private static boolean safeQueen(boolean[][] board, int row, int column) {
		// check vertical row cells
		for(int i=0; i<row; i++) {
			if(board[i][column]) {
				return false;
			}
		}
		
		// left diagonal cells check
		int maxLeft = Math.min(row, column);
		for(int i=1; i<=maxLeft; i++) {
			if(board[row-i][column-i]) {
				return false;
			}
		}
		
		// right diagonal cells check
		int maxRight = Math.min(row, board.length - column - 1);
		for(int i=1; i<=maxRight; i++) {
			if(board[row-i][column+i]) {
				return false;
			}
		}
		return true;
	}
	
	private static void display(boolean[][] board) {
		for(boolean[] row : board) {
			for(boolean i : row) {
				if(i) 
					System.out.print("Q ");
				else 
					System.out.print("X ");
			}
			System.out.println();
		}
	}

}
