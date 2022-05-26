package DP;

import java.util.Arrays;

public class DistinctSubsequence {
    public static int sequence(String source, String target, int n, int m, int dp[][]) {
        if (m == 0) { //// length of target /////
            return 1;
        }
        if (n == 0) { ////// length of source /////
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        int inc = 0;
        int exc = 0;

        if (source.charAt(n - 1) == target.charAt(m - 1)) {
            inc = sequence(source, target, n - 1, m - 1, dp);
        }
        exc = sequence(source, target, n - 1, m, dp);

        return dp[n][m] = inc + exc;
    }

    public static void main(String[] args) {
        String source = "rabbbit";
        String target = "rabbit";
        int n = source.length();
        int m = target.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(sequence(source, target, n, m, dp));
    }
}