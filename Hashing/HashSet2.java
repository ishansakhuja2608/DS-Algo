package Hashing;

import java.util.HashSet;;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("DSA");
        h.add("Algorithms");
        h.add("Practice");
        System.out.println(h);
        System.out.println(h.size());
        h.remove("Algorithms");
        System.out.println(h);
        System.out.println(h.size());
        for (String s : h)
            System.out.print(s + " ");
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.isEmpty());
    }
}
