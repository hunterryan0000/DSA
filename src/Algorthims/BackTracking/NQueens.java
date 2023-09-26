package Algorthims.BackTracking;

public class NQueens {

    /**
     * Comment Block: isSafe function
     * This function checks if a queen can be placed on board[row][col] without clashing with other queens.
     *
     * @param board The 2D array representing the chess board
     * @param row The row index to place the new queen
     * @param col The column index to place the new queen
     * @param n The size of the board (n x n)
     * @return true if it is safe to place the queen, false otherwise
     */
    static boolean isSafe(int board[][], int row, int col, int n) {
        // Check for any queen in this row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
        }

        // Check for any queen in the upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check for any queen in the lower diagonal
        for (int i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1) return false;
        }

        return true;  // Safe to place queen here
    }

    /**
     * Comment Block: solveNQUtil function
     * This is the core function for solving the N-Queens problem.
     * It uses backtracking to solve the problem.
     *
     * @param board The 2D array representing the chess board
     * @param col The current column index
     * @param N The size of the board (N x N)
     * @return true if the board could be successfully populated, false otherwise
     */
    static boolean solveNQUtil(int board[][], int col, int N) {
        // If all queens are placed, return true
        if (col >= N) return true;

        // Attempt to place a queen in each row of the current column
        for (int i = 0; i < N; i++) {
            // Check if it's safe to place a queen at board[i][col]
            if (isSafe(board, i, col, N)) {
                board[i][col] = 1;  // Place the queen

                // Move on to the next column and try to place the rest of the queens
                if (solveNQUtil(board, col + 1, N)) return true;

                board[i][col] = 0;  // Backtrack, remove the queen
            }
        }

        return false;  // No solution exists
    }
}


