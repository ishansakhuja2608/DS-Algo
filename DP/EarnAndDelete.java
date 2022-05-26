package DP;

import java.util.Arrays;

public class EarnAndDelete {
    static int deleteAndEarn(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            max = Math.max(i, max);
        }
        int freq[] = new int[max + 1];
        for (int e : arr) {
            freq[e] += e;
        }
        int dp[] = new int[freq.length + 1];
        Arrays.fill(dp, -1);
        return robber(freq, 0, freq.length, dp);
    }

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
        int arr[] = { 3, 4, 2 };
        System.out.println(deleteAndEarn(arr));
    }
}
