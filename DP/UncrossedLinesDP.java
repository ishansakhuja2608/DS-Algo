package DP;

import java.util.Arrays;

public class UncrossedLinesDP {
    public static int uncrossedLines(int[] s1, int[] s2, int n, int m, int dp[][]) {

        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (s1[n - 1] == s2[m - 1]) {
            return dp[n][m] = 1 + uncrossedLines(s1, s2, n - 1, m - 1, dp);
        } else {
            int c1 = uncrossedLines(s1, s2, n, m - 1, dp);
            int c2 = uncrossedLines(s1, s2, n - 1, m, dp);

            return dp[n][m] = Math.max(c1, c2);
        }
    }

    public static void main(String[] args) {
        int[] s1 = { 1, 4, 2 };
        int[] s2 = { 1, 2, 4 };
        int dp[][] = new int[s1.length + 1][s2.length + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        System.out.println(uncrossedLines(s1, s2, s1.length, s2.length, dp));
    }
}
