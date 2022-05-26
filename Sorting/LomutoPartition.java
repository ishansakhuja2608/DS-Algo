package Sorting;

public class LomutoPartition {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 80, 30, 90, 40, 50, 70 };
        int n = arr.length;
        lomutoPartition(arr, 0, n - 1);
        for (int x : arr)
            System.out.print(x + " ");
    }

    static int lomutoPartition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }
}
