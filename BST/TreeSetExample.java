package BST;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>();
        s.add("GFG");
        s.add("Courses");
        s.add("IDE");

        System.out.println(s);

        System.out.println(s.contains("IDE"));

        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
