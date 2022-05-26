package Array;

public class Palindrome {

    static boolean pal(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return (rev == n);
    }

    public static void main(String[] args) {
        int num = 853;
        System.out.println(pal(num));
    }
}
