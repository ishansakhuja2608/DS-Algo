package Recursion;

public class LexicoCounting {
    static void lexicoPrint(int start, int end) {
        if (start > end)
            return;

        System.out.println(start);
        int callD = 0;
        if (start == 0) {
            callD = 1;
        }

        while (callD <= 9) {
            lexicoPrint(start * 10 + callD, end);
            callD++;
        }
    }

    public static void main(String[] args) {
        lexicoPrint(0, 100);
    }
}