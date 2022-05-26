package DP;

public class CoinsChange2 {
    static int change(int coins[], int curr, int amount) {
        if (amount == 0) {
            return 1;
        }
        if (curr == coins.length) {
            return 0;
        }
        int inc = 0;
        int exc = 0;
        if (coins[curr] <= amount) {
            inc = change(coins, curr, amount - coins[curr]);
        }
        exc = change(coins, curr + 1, amount);

        return inc + exc;
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5 };
        System.out.println(change(coins, 0, 5));
    }
}
