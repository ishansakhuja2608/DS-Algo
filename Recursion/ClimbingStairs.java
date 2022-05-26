package Recursion;

public class ClimbingStairs {
    static int ways(int curr, int n) {
        if (curr == n)
            return 1;
        if (curr > n)
            return 0;
        int c1 = ways(curr + 1, n);
        int c2 = ways(curr + 2, n);

        return c1 + c2;
    }

    public static void main(String[] args) {
        System.out.println(ways(0, 3));
    }
}
