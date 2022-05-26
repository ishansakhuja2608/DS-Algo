package Recursion;

public class GenerateParenthesis {
    static void paranthesis(String res, int oc, int cc, int n) {
        if (oc == n && cc == n) {
            System.out.println(res);
            return;
        }
        if (oc < n) {
            paranthesis(res + '(', oc + 1, cc, n);
        }
        if (oc > cc) {
            paranthesis(res + ')', oc, cc + 1, n);
        }
    }

    public static void main(String[] args) {
        paranthesis("", 0, 0, 4);
    }
}