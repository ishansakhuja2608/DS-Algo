class Solution {
    public void solve(char[][] board) {

        if (board.length == 0 || board[0].length == 0)
            return;
        if (board.length < 2 || board[0].length < 2)
            return;

        int m = board.length;
        int n = board[0].length;

        // Any '0' connected to a boundary cannot be turned into 'X', so start from
        // first and last column and turn '0' into '*'

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                DFS(board, i, 0);
            }
            if (board[i][n - 1] == 'O') {
                DFS(board, i, n - 1);
            }
        }
        // start from first and last row, turn '0' into '*'
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                DFS(board, 0, j);
            }
            if (board[m - 1][j] == 'O') {
                DFS(board, m - 1, j);
            }
        }

        // rest of the algo to turn '0' into 'x' and '*' back to '0'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void DFS(char[][] board, int i, int j) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1) {
            return;
        }
        if (board[i][j] == 'O')
            board[i][j] = '*';
        if (i > 1 && board[i - 1][j] == 'O') {
            DFS(board, i - 1, j);
        }
        if (i < board.length - 2 && board[i + 1][j] == 'O') {
            DFS(board, i + 1, j);
        }
        if (j > 1 && board[i][j - 1] == 'O') {
            DFS(board, i, j - 1);
        }
        if (j < board[i].length - 2 && board[i][j + 1] == 'O') {
            DFS(board, i, j + 1);
        }
    }
}

class LC {
    public static void main(String[] args) {

    }
}