import java.util.Scanner;

public class Queen {
    
    // Solve N-Queens
    public static void nQueens(char[][] board, int row, int[] solutionCount) {
        if (row == board.length) {
            solutionCount[0]++;
            System.out.println("Solution #" + solutionCount[0] + ":");
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1, solutionCount);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    // Check if placing queen is safe
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // Check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Print the board
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (size of chessboard): ");
        int n = sc.nextInt();

        char[][] board = new char[n][n];

        // Initialize with empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        int[] solutionCount = {0};
        nQueens(board, 0, solutionCount);

        if (solutionCount[0] == 0) {
            System.out.println("No solutions found for N = " + n);
        } else {
            System.out.println("Total solutions: " + solutionCount[0]);
        }
    }
}
