package Recursion;

public class BoardPath {
    static int boarding(int destination, int curr) {
        if (curr == destination)
            return 1;
        if (curr > destination)
            return 0;
        int c1 = boarding(destination, curr + 1);
        int c2 = boarding(destination, curr + 2);
        int c3 = boarding(destination, curr + 3);
        int c4 = boarding(destination, curr + 4);
        int c5 = boarding(destination, curr + 5);
        int c6 = boarding(destination, curr + 6);

        return c1 + c2 + c3 + c4 + c5 + c6;
    }

    public static void main(String[] args) {
        System.out.println(boarding(10, 0));
    }
}
