package DP;

import java.util.Arrays;

public class MinPathSumDP {

    public static int minCost(int grid[][], int cr, int cc, int er, int ec, int dp[][]) {
        if (cr > er || cc > ec) {
            return Integer.MAX_VALUE;
        }

        if (cr == er && cc == ec) {
            return grid[cr][cc];
        }
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }
        int right = minCost(grid, cr, cc + 1, er, ec, dp);
        int down = minCost(grid, cr + 1, cc, er, ec, dp);

        int mn = Math.min(right, down) + grid[cr][cc];

        return dp[cr][cc] = mn;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        int dp[][] = new int[grid.length + 1][grid[0].length + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        System.out.println(minCost(grid, 0, 0, grid.length - 1, grid[0].length - 1, dp));
    }
}
