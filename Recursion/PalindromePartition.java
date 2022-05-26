package Recursion;

public class PalindromePartition {

    static boolean isPalindrome(String partition) {
        int low = 0;
        int high = partition.length() - 1;
        while (low < high) {
            if (partition.charAt(low) != partition.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    static void partitionP(String in, String res) {
        if (in.length() == 0) {
            System.out.println(res);
            return;
        }
        for (int i = 1; i <= in.length(); i++) {
            if (isPalindrome(in.substring(0, i)))
                partitionP(in.substring(i), res + in.substring(0, i) + '|');
        }
    }

    public static void main(String[] args) {
        partitionP("nitin", "");
    }
}
