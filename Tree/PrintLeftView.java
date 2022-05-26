package Tree;

class NodeLeft {
    int data;
    NodeLeft left;
    NodeLeft right;

    NodeLeft(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class PrintLeftView {
    public static void main(String[] args) {
        NodeLeft root = new NodeLeft(10);
        root.left = new NodeLeft(20);
        root.right = new NodeLeft(30);
        root.right.left = new NodeLeft(40);
        root.right.right = new NodeLeft(50);

        leftViewPrint(root);
    }

    public static void leftViewPrint(NodeLeft root) {
        printLeft(root, 1);
    }

    static int maxLevel = 0;

    public static void printLeft(NodeLeft root, int level) {
        if (root == null)
            return;
        if (maxLevel < level) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
    }
}