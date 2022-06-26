package BST;

import java.util.*;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();

        t.put(10, "GFG");
        t.put(15, "IDE");
        t.put(5, "Courses");

        // higherKey -> returns the smallest key greater than the passed key, i.e. 15
        System.out.println(t.higherKey(10));

        // lowerKey -> return the greatest key smaller than the passed key, 5
        System.out.println(t.lowerKey(10));

        // floorKey -> greatest key <= passed key -> 10
        System.out.println(t.floorKey(10));

        // ceilingKey -> greatest key >= passed key -> 10
        System.out.println(t.ceilingKey(10));
    }
}
