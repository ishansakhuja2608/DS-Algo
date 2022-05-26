package Hashing;

import java.util.*;

class MyHash { //////////// chaining is a way to handle collisions /////////////
    int bucket;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b) {
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++)
            table.add(new LinkedList<Integer>());
    }

    void insert(Integer k) {
        int i = k % bucket;
        table.get(i).add(k);
    }

    boolean search(Integer k) {
        int i = k % bucket;
        return table.get(i).contains(k);
    }

    void delete(Integer k) {
        int i = k % bucket;
        table.get(i).remove(k);
    }

}

public class ChainingImplementation {
    public static void main(String[] args) {
        MyHash m = new MyHash(7);
        m.insert(10);
        m.insert(20);
        m.insert(15);
        m.insert(7);
        System.out.println(m.search(10));
        m.delete(15);
        System.out.println(m.search(15));
    }
}