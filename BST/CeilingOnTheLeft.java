package BST;
// Given an array, we need to find the ceiling of a particular element on the left side of the element

// arr[] = [2,8,30,15,25,12], op -> -1 -1 -1 30 30 15
// arr[] = [30, 20, 10], op -> -1 30 20
// arr[] = [10, 20, 30], op -> -1 -1 -1

import java.util.*;

public class CeilingOnTheLeft {

    public static void printCeiling(int[] arr, int n) {
        System.out.print("-1" + " ");
        TreeSet<Integer> s = new TreeSet<>();
        s.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (s.ceiling(arr[i]) != null) {
                System.out.print(s.ceiling(arr[i]) + " ");
            } else {
                System.out.print("-1" + " ");
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 30, 15, 25, 12 };
        int n = arr.length;

        // printCeilingNaive(arr, n);
        System.out.println();
        printCeiling(arr, n);
    }

    public static void printCeilingNaive(int arr[], int n) {
        System.out.print("-1" + " ");
        for (int i = 1; i < n; i++) {
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    diff = Math.min(diff, arr[j] - arr[i]);
                }
            }
            if (diff == Integer.MAX_VALUE) {
                System.out.print("-1" + " ");
            } else {
                System.out.print((arr[i] + diff) + " ");
            }
        }
    }

}
