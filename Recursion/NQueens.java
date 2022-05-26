package Recursion;

public class NQueens {
    static int count;

    static boolean canPlaced(int board[][], int cr, int cc, int n) {
        for (int row = 0; row <= cr - 1; row++) {
            if (board[row][cc] == 1)
                return false;
        }

        int row = cr;
        int col = cc;
        while (row >= 0 && col < n) { // right diagonal
            if (board[row][col] == 1)
                return false;
            row--;
            col++;
        }

        row = cr;
        col = cc;
        while (row >= 0 && col >= 0) { // left diagonal
            if (board[row][col] == 1)
                return false;
            row--;
            col--;
        }
        return true;
    }

    static void totalNQueens(int board[][], int n, int cr) {
        if (cr == n) {

            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    if (board[r][c] == 1)
                        System.out.print('Q' + " ");
                    else
                        System.out.print('-' + " ");
                }
                System.out.println();
            }
            System.out.println("___________________");
            count++;
            return;
        }
        for (int cc = 0; cc < n; cc++) {
            if (canPlaced(board, cr, cc, n) == true) {
                board[cr][cc] = 1;
                totalNQueens(board, n, cr + 1);
                board[cr][cc] = 0;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int n = 4;
        int board[][] = new int[n][n];
        count = 0;
        totalNQueens(board, n, 0);
        System.out.println(count);

    }
}