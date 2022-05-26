package Recursion;

public class Partition {
    static void partition(String in, String res) {
        if (in.length() == 0) {
            System.out.println(res);
            return;
        }
        for (int i = 1; i <= in.length(); i++) {
            partition(in.substring(i), res + in.substring(0, i) + '|');
        }
    }

    public static void main(String[] args) {
        partition("nitin", "");
    }
}
