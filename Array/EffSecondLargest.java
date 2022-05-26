package Array;
// a[i] > a[largest] : res = largest, largest = i

// a[i] == a[largest] : Ignore
// a[i] < a[largest] :
//                  res == -1 : res = 1
//                  a[i] <= a[res] : Ignore
//                  a[i] > a[res] : res = i

public class EffSecondLargest {
    static int secLar(int arr[]) {
        int res = -1;
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 7, 8, 6, 9 };
        System.out.println(secLar(arr));
    }
}
