package Array;

public class CountDigits {

    static int countDigits(int x) {
        int ans = 0;
        while (x > 0) {
            x = x / 10;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 5685;
        System.out.println(countDigits(num));
    }
}
