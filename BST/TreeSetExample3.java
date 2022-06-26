package BST;

import java.util.*;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(5);
        s.add(2);
        s.add(15);

        // Lower(5) -> Largest value which is smaller than 5
        System.out.println(s.lower(5));

        // Highrt(5) -> Smallest value which is greater than 5
        System.out.println(s.higher(5));

        // Floow -> Value which is less than or equal to x
        System.out.println(s.floor(5));

        // Ceil -> Value which is greater than or equal to x
        System.out.println(s.ceiling(5));
    }
}
