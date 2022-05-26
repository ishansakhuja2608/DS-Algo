package Array;

public class MaxCount1sEff {
    static int maxConsecutive(int arr[]) {
        int res = 0;
        int curr = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                curr = 0;
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0 };
        System.out.println(maxConsecutive(arr));
    }
}
