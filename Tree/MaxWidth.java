package Tree;

import java.util.LinkedList;
import java.util.Queue;

class NodeM {
    int data;
    NodeM left;
    NodeM right;

    NodeM(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class MaxWidth { /// maximum of number of nodes at each level ///
    public static void main(String[] args) {
        NodeM root = new NodeM(10);
        root.left = new NodeM(20);
        root.right = new NodeM(30);
        root.left.left = new NodeM(40);
        root.left.right = new NodeM(50);
        root.right.left = new NodeM(60);

        System.out.println(maxWidth(root));
    }

    public static int maxWidth(NodeM root) {
        if (root == null)
            return 0;
        Queue<NodeM> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while (q.isEmpty() == false) {
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                NodeM curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }

        return res;
    }
}