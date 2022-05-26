package Recursion;

public class MazePathAll {
    static void maze(int cr, int cc, int er, int ec, String path, boolean[][] vis) {
        if (cr < 0 || cc < 0 || cr > er || cc > ec || vis[cr][cc] == true) {
            return;
        }
        if (cr == er && cc == ec) {
            System.out.println(path);
            return;
        }
        vis[cr][cc] = true;
        maze(cr - 1, cc, er, ec, path + 'U', vis);
        maze(cr + 1, cc, er, ec, path + 'D', vis);
        maze(cr, cc - 1, er, ec, path + 'L', vis);
        maze(cr, cc + 1, er, ec, path + 'R', vis);
        vis[cr][cc] = false; /// Backtracking step ///
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        maze(0, 0, n - 1, m - 1, "", new boolean[n][m]);
    }
}