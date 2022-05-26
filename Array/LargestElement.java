package Array;

public class LargestElement {
    static int largest(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 7, 8, 6, 9 };
        System.out.println(largest(arr));
    }
}
