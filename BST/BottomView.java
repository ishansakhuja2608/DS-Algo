package BST;

import java.util.*;

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class BottomView {

    static void bottomView(Node root) {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> mp = new TreeMap<>();
        q.add(new Pair(root, 0));

        while (q.isEmpty() == false) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;

            mp.put(hd, curr.key);
            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));
            }
        }
        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            System.out.print(x.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        bottomView(root);
    }
}
