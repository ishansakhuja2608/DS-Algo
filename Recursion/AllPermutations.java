package Recursion;

public class AllPermutations {
    static void perutations(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            perutations(s.substring(0, i) + s.substring(i + 1), res + curr);
        }
    }

    public static void main(String[] args) {
        perutations("a b", "");
    }
}
