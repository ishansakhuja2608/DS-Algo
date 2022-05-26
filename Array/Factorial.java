package Array;

public class Factorial {
    static int fac(int n) {
        if (n == 0)
            return 1;
        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(fac(num));
    }
}
