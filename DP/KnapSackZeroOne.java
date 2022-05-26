package DP;

public class KnapSackZeroOne {

    static int maxProfit(int price[], int weight[], int bagC, int curr) {
        if (bagC == 0 || curr == price.length) {
            return 0;
        }
        int rob = 0;
        int dont = 0;
        if (weight[curr] <= bagC) {
            rob = price[curr] + maxProfit(price, weight, bagC - weight[curr], curr + 1);
        }
        dont = maxProfit(price, weight, bagC, curr + 1);

        return Math.max(rob, dont);
    }

    public static void main(String[] args) {
        int bagC = 6;
        int price[] = { 20, 10, 30, 40 };
        int weight[] = { 2, 1, 4, 5 };
        System.out.println(maxProfit(price, weight, bagC, 0));
    }
}
