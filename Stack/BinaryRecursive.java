
public class BinaryRecursive {

    static int rSearch(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == x)
            return mid;
        else if (arr[mid] > x)
            return (rSearch(arr, low, mid - 1, x));
        else
            return (rSearch(arr, mid + 1, high, x));
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 }, n = 7;

        int x = 50;

        System.out.println(rSearch(arr, 0, n - 1, x));
    }

}