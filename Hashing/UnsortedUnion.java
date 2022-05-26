package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnsortedUnion {
    static int unionCount(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
            set.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            set.add(arr2[i]);
        return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 8, 3, 5, 6 };
        int arr2[] = { 4, 8, 3, 6, 1 };
        System.out.println(unionCount(arr1, arr2));
    }
}
