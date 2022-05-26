package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
    int data;
    Node1 left;
    Node1 right;

    Node1(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class LevelOrderTraversal1 {
    public static void main(String[] args) {
        Node1 root = new Node1(10);
        root.left = new Node1(20);
        root.right = new Node1(30);
        root.left.left = new Node1(40);
        root.left.right = new Node1(50);
        root.right.left = new Node1(60);
        root.right.right = new Node1(70);

        levelPrint(root);
    }

    public static void levelPrint(Node1 root) {
        if (root == null)
            return;
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
            Node1 curr = q.poll();
            if (curr == null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }
}
