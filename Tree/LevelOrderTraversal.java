package Tree;

import java.util.LinkedList;
import java.util.Queue;

class NodeL {
    int data;
    NodeL left;
    NodeL right;

    NodeL(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class LevelOrderTraversal { //////// need to print all nodes in level order manner //////////
    public static void main(String[] args) {
        NodeL root = new NodeL(10);
        root.left = new NodeL(20);
        root.right = new NodeL(30);
        root.left.left = new NodeL(40);
        root.left.right = new NodeL(50);
        root.right.left = new NodeL(60);
        root.right.right = new NodeL(70);

        printLevl(root);
    }

    public static void printLevl(NodeL root) {
        if (root == null)
            return;
        Queue<NodeL> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty() == false) {
            NodeL curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }
}
