package Array;

public class IfSorted {
    static boolean ifSorted(int arr[]) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                count++;
            } else
                count--;
        }
        return (count == arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 5, 8, 9, 10, 11, 15, 18, 22 };
        System.out.println(ifSorted(arr));
    }
}
/*
 * for(int i=1;i<arr.length;i++){
 * if(arr[i] < arr[i-1])
 * return false;
 * return true;
 * }
 */