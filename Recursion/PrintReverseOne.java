package Recursion;

public class PrintReverseOne {
    static void reverse(int arr[], int curr) {
        if (curr == -1) {
            return;
        }
        System.out.println(arr[curr]);
        reverse(arr, curr - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 6, 5, 7 };
        int curr = 4;
        reverse(arr, curr);
    }
}
