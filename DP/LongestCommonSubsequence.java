package DP;

public class LongestCommonSubsequence {
    public static int lcs(String s1, String s2, int n, int m) {

        if (n == 0 || m == 0) {
            return 0;
        }

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return 1 + lcs(s1, s2, n - 1, m - 1);
        } else {
            int c1 = lcs(s1, s2, n, m - 1);
            int c2 = lcs(s1, s2, n - 1, m);

            return Math.max(c1, c2);
        }
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(lcs(s1, s2, s1.length(), s2.length()));
    }
}
