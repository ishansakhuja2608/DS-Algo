package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Spiral {
    int data;
    Spiral left;
    Spiral right;

    Spiral(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class SpiralTraversal {
    public static void main(String[] args) {
        Spiral root = new Spiral(1);
        root.left = new Spiral(2);
        root.right = new Spiral(3);
        root.left.left = new Spiral(4);
        root.left.right = new Spiral(5);
        root.right.left = new Spiral(6);
        root.right.right = new Spiral(7);

        printSpiral(root);
    }

    public static void printSpiral(Spiral root) {

        if (root == null)
            return;

        Queue<Spiral> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;
        q.add(root);

        while (q.isEmpty() == false) {
            int count = q.size();

            for (int i = 0; i < count; i++) {
                Spiral curr = q.poll();
                if (reverse)
                    s.add(curr.data);
                else
                    System.out.print(curr.data + " ");
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            if (reverse) {
                while (s.isEmpty() == false) {
                    System.out.print(s.pop() + " ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }
}
