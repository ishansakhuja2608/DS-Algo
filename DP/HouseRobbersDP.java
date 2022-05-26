package DP;

import java.util.Arrays;

public class HouseRobbersDP {

    static int robber(int houses[], int curr, int n, int dp[]) {

        if (curr >= n) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int rob = houses[curr] + robber(houses, curr + 2, n, dp);
        int dont = robber(houses, curr + 1, n, dp);

        return dp[curr] = Math.max(rob, dont);
    }

    public static void main(String[] args) {
        int houses[] = { 2, 7, 9, 3, 1 };
        int n = 5;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(robber(houses, 0, n, dp));
    }
}