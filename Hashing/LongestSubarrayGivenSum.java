package Hashing;

import java.util.HashSet;

public class LongestSubarrayGivenSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 8, 3, -7, -4, 1 };
        int sum = -8;
        System.out.println(largestSubarrayWithSum(arr, sum));
    }

    static int largestSubarrayWithSum(int arr[], int sum) {
        int pSum = 0;
        HashSet<Integer> s = new HashSet<>();
        s.add(0);
        for (int i = 0; i < arr.length; i++) {
            pSum += arr[i];
            if (s.contains(pSum - sum))
                return 1;
            s.add(pSum);
        }
        return 0;
    }
}