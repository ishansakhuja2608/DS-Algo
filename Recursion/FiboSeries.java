package Recursion;

public class FiboSeries {
    static int fb(int n) {
        if (n == 0 || n == 1)
            return n;
        int c1 = fb(n - 1);
        int c2 = fb(n - 2);

        return c1 + c2;
    }

    public static void main(String[] args) {
        System.out.println(fb(10));
    }
}
