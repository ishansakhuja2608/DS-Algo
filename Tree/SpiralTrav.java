package Tree;

import java.util.Stack;

/*
1. push root to the s1
2. while any of the two stacks is not empty
    while s1 is not empty
        take out a note, print it
        push children of the taken out node into s2
    while s2 is not empty
        take out the node, print it
        puch children of the taken out node into s1 in reverse order
*/

class NodeS {
    int data;
    NodeS left;
    NodeS right;

    NodeS(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class SpiralTrav {
    public static void main(String[] args) {
        NodeS root = new NodeS(1);
        root.left = new NodeS(2);
        root.right = new NodeS(3);
        root.left.left = new NodeS(4);
        root.left.right = new NodeS(5);
        root.right.left = new NodeS(6);
        root.right.right = new NodeS(7);

        spiralPrint(root);
    }

    public static void spiralPrint(NodeS root) {
        if (root == null)
            return;
        Stack<NodeS> s1 = new Stack<>();
        Stack<NodeS> s2 = new Stack<>();

        s1.add(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                NodeS temp = s1.peek();
                s1.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null)
                    s2.add(temp.right);
                if (temp.left != null)
                    s2.add(temp.left);
            }
            while (!s2.isEmpty()) {
                NodeS temp = s2.peek();
                s2.pop();
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    s1.add(temp.left);
                if (temp.right != null)
                    s1.add(temp.right);
            }

        }
    }
}
