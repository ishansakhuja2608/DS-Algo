package DP;

import java.util.Arrays;

public class CoinChangeTwoDP {
    static int change(int coins[], int curr, int amount, int dp[][]) {
        if (amount == 0) {
            return 1;
        }
        if (curr == coins.length) {
            return 0;
        }
        if (dp[curr][amount] != -1) {
            return dp[curr][amount];
        }
        int inc = 0;
        int exc = 0;
        if (coins[curr] <= amount) {
            inc = change(coins, curr, amount - coins[curr], dp);
        }
        exc = change(coins, curr + 1, amount, dp);

        return dp[curr][amount] = inc + exc;
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5 };
        int amount = 5;
        int dp[][] = new int[coins.length + 1][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(change(coins, 0, amount, dp));
    }
}