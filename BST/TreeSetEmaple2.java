package BST;

import java.util.*;

public class TreeSetEmaple2 {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(50);
        s.add(40);

        s.remove(50);

        for (Integer x : s) {
            System.out.print(x + " ");
        }
    }
}
