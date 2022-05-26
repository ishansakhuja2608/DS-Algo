package Hashing;

import java.util.Set;
import java.util.HashSet;

public class PairWithGivenSum {
    static boolean ifPair(int arr[], int sum) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(sum - x))
                return true;
            else
                set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 8, 4, 7, 6, 1 };
        int x = 14;
        System.out.println(ifPair(arr, x));
    }
}
