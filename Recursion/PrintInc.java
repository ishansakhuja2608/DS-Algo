package Recursion;

public class PrintInc {
    static void increasing(int n) {
        if (n == 0)
            return;
        increasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        increasing(5);
    }
}
