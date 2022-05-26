package Hashing;

import java.util.HashSet;

public class CountDistinctElements {

    static int distinctCount(int arr[]) {
        HashSet<Integer> set = new HashSet<>(); // HashSet<Integer> set = new HashSet<>(Arrays.asList(arr)); can also be
                                                // used //
        for (int i = 0; i < arr.length; i++) // no need for adding the objects externally using for loop //
            set.add(arr[i]);
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 20, 30 };
        System.out.println(distinctCount(arr));
    }
}
