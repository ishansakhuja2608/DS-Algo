package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyArrayElement {
    public static void main(String[] args) {
        int arr[] = new int[] { 15, 16, 27, 27, 28, 15 };
        int n = arr.length;

        countDistinct(arr, n);
    }

    static void countDistinct(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (map.containsKey(key) == true)
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }
        for (Map.Entry<Integer, Integer> itr : map.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }
}