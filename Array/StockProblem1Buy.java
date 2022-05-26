package Array;

public class StockProblem1Buy { ////////////////// single buy and sell ////////////////
    static int maxProfit(int arr[]) {
        int mp = 0;
        int minSoFar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            mp = Math.max(mp, profit);
        }
        return mp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 6, 1, 4 };
        System.out.println(maxProfit(arr));
    }

}
