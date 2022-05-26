package Tree;

class NodeK { /////// O(n) /////////// space - proportional to the height of binary tree
              /////// ///////
    int key;
    NodeK left;
    NodeK right;

    NodeK(int d) {
        key = d;
        left = null;
        right = null;
    }
}

public class NodesAtDistanceK {
    public static void main(String[] args) {
        NodeK root = new NodeK(10);
        root.left = new NodeK(20);
        root.right = new NodeK(30);
        root.left.left = new NodeK(40);
        root.left.right = new NodeK(50);
        root.right.right = new NodeK(70);
        root.right.right.right = new NodeK(80);
        int k = 2;
        printDistK(root, k);
    }

    public static void printDistK(NodeK root, int k) {
        if (root == null)
            return;
        if (k == 0) {
            System.out.print(root.key + " ");
        } else {
            printDistK(root.left, k - 1);
            printDistK(root.right, k - 1);
        }
    }
}
