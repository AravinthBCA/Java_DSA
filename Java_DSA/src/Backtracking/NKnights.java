package Backtracking;

public class NKnights {

	public static void main(String[] args) {
		int n = 3;
		boolean[][] board = new boolean[n][n];
		System.out.println(knight(board, 0, 0, n, 0));
	}
	
	private static int knight(boolean[][] board, int row, int col, int knights, int count) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return ++count;
        }

        if (row == board.length - 1 && col == board.length) {
            return count;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knights, count);
            return count;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1, count);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights, count);
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
