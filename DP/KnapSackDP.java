package DP;

import java.util.Arrays;

public class KnapSackDP {

    static int maxProfit(int price[], int weight[], int bagC, int curr, int dp[][]) {
        if (bagC == 0 || curr == price.length) {
            return 0;
        }
        if (dp[curr][bagC] != -1) {
            return dp[curr][bagC];
        }
        int rob = 0;
        int dont = 0;
        if (weight[curr] <= bagC) {
            rob = price[curr] + maxProfit(price, weight, bagC - weight[curr], curr + 1, dp);
        }
        dont = maxProfit(price, weight, bagC, curr + 1, dp);

        return dp[curr][bagC] = Math.max(rob, dont);
    }

    public static void main(String[] args) {
        int bagC = 6;
        int price[] = { 20, 10, 30, 40 };
        int weight[] = { 2, 1, 4, 5 };
        int dp[][] = new int[price.length + 1][bagC + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(maxProfit(price, weight, bagC, 0, dp));
    }
}
