package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class SetHash {
    public static void main(String[] args) { ///// add, contains and iterator /////////
        HashSet<String> h = new HashSet<>();
        h.add("Ishan");
        h.add("Sakhuja");
        h.add("Java Collections");
        System.out.println(h);
        System.out.println(h.contains("ishan"));
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next() + " ");

    }
}