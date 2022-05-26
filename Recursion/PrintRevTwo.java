package Recursion;

public class PrintRevTwo {
    static void reverseTwo(int arr[], int curr, int n) {
        if (curr == n)
            return;
        reverseTwo(arr, curr + 1, n);
        System.out.println(arr[curr]);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 9, 8, 7 };
        int curr = 0;
        reverseTwo(arr, curr, arr.length);
    }
}
