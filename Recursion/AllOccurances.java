package Recursion;

public class AllOccurances {
    private static int[] sol(int[] arr, int curr, int n, int search, int count) {
        if (curr == n) {
            int[] ans = new int[count];
            if (count == 0) {
                System.out.println(-1);
            }
            return ans;
        }
        if (arr[curr] == search) {
            int[] recA = sol(arr, curr + 1, n, search, count + 1);
            // modification
            recA[count] = curr;
            return recA;
        } else {
            int[] recA = sol(arr, curr + 1, n, search, count);
            return recA;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 2, 5, 2 };
        int n = 6;
        int[] ans = sol(arr, 0, n, 2, 0);

        for (int x : ans) {
            System.out.println(x);
        }
    }

}
