package Recursion;

public class FactorialPush {
    static void fact1(int n, int ans) {
        if (n == 0 || n == 1) {
            System.out.println(ans);
            return;
        }
        fact1(n - 1, n * ans);
    }

    public static void main(String[] args) {
        fact1(5, 1);
    }
}
