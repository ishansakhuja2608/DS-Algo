package Tree;

class NodeP {
    int key;
    NodeP left;
    NodeP right;

    NodeP(int key) {
        this.key = key;
        left = null;
        right = null;
    }
}

public class PostorderImplementation {
    public static void main(String[] args) {
        NodeP root = new NodeP(10);
        root.left = new NodeP(20);
        root.right = new NodeP(30);
        root.right.left = new NodeP(40);
        root.right.right = new NodeP(50);

        postOrder(root);
    }

    public static void postOrder(NodeP root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }
}
