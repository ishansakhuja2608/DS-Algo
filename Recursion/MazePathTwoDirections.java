package Recursion;

public class MazePathTwoDirections {
    static int count;

    static void printMAze(int cr, int cc, int er, int ec, String path) {
        if (cr > ec || cc > ec) {
            return;
        }
        if (cr == er && cc == ec) {
            count++;
            System.out.println(path);
            return;
        }

        printMAze(cr + 1, cc, er, ec, path + 'R');
        printMAze(cr, cc + 1, er, ec, path + 'D');
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        count = 0; ///// reinitializing is necessary /////////
        printMAze(0, 0, n - 1, m - 1, "");
        System.out.println(count);
    }
}
