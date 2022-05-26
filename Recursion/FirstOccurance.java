package Recursion;

public class FirstOccurance {
    static int occ(int arr[], int curr, int n, int search) {
        if (curr == n)
            return -1;
        if (arr[curr] == search)
            return curr;
        int res = occ(arr, curr + 1, n, search);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 2, 5 };
        int n = 5;
        System.out.println(occ(arr, 0, n, 3));
    }
}
