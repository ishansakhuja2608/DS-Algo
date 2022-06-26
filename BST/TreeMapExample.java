package BST;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(10, "GFG");
        t.put(15, "IDE");
        t.put(5, "Courses");

        System.out.println(t);

        System.out.println(t.containsKey(10));

        for (Map.Entry<Integer, String> e : t.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
