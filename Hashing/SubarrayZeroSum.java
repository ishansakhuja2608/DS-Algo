package Hashing;

import java.util.HashSet;

import java.util.Set;

public class SubarrayZeroSum {

    static boolean zeroSum(int arr[]) {
        Set<Integer> s = new HashSet<>();
        int pSum = 0;
        s.add(0);
        for (int i = 0; i < arr.length; i++) {
            pSum += arr[i];
            if (s.contains(pSum) == true)
                return true;

            s.add(pSum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 5, 3, 9, -4, -6, 7, -1 };
        System.out.println(zeroSum(arr));
    }
}