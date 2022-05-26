package Recursion;

public class BlockedMaze {
    static void blockedMaze(int maze[][], int cr, int cc, int er, int ec, String path, boolean[][] vis) {
        if (cr < 0 || cc < 0 || cr > er || cc > ec || vis[cr][cc] == true || maze[cr][cc] == 1) {
            return;
        }
        if (cr == er && cc == ec) {
            System.out.println(path);
            return;
        }
        vis[cr][cc] = true;
        blockedMaze(maze, cr - 1, cc, er, ec, path + 'U', vis);
        blockedMaze(maze, cr + 1, cc, er, ec, path + 'D', vis);
        blockedMaze(maze, cr, cc - 1, er, ec, path + 'L', vis);
        blockedMaze(maze, cr, cc + 1, er, ec, path + 'R', vis);
        vis[cr][cc] = false; /// Backtracking step ///
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 1, 1, 0 } };
        blockedMaze(maze, 0, 0, n - 1, m - 1, "", new boolean[n][m]);
    }
}