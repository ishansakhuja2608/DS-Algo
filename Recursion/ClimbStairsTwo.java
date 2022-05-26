package Recursion;

public class ClimbStairsTwo {
    static int climbing(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        int x = climbing(n - 1);
        int y = climbing(n - 2);
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(climbing(3)); ////// 1, 1, 1 ////// 2, 1 /////// 1, 2 /////////// for 3
    }
}
