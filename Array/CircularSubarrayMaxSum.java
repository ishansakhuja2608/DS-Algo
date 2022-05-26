package Array;

public class CircularSubarrayMaxSum {
    static int fun(int arr[]) {
        int n = arr.length;
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int currMax = arr[i];
            int currSum = arr[i];
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                currSum += arr[index];
                currMax = Math.max(currSum, currMax);
            }
            res = Math.max(res, currMax);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, -2, 3, 4 };
        System.out.println(fun(arr));
    }
}