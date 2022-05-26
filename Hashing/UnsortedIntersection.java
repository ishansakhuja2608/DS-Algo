
package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnsortedIntersection { //// find the count of common elements ////
    public static void main(String[] args) {
        int arr1[] = new int[] { 15, 16, 27, 27, 28, 15 };
        int arr2[] = new int[] { 16, 17, 28, 17, 31, 17 };
        int m = arr1.length;
        int n = arr2.length;

        System.out.println(intersection(arr1, m, arr2, n));
    }

    static int intersection(int arr1[], int m, int[] arr2, int n) {
        Set<Integer> h = new HashSet<>();
        for (int i = 0; i < m; i++)
            h.add(arr1[i]);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (h.contains(arr2[i])) {
                res++;
                h.remove(arr2[i]);
            }
        }
        return res;
    }
}