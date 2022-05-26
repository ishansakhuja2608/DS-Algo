package Tree;

class PNode { ///// same as inorder ///////
    int key;
    PNode left;
    PNode right;

    PNode(int d) {
        key = d;
        left = null;
        right = null;
    }
}

public class PreorderImplementation {
    public static void main(String[] args) {
        PNode root = new PNode(10);
        root.left = new PNode(20);
        root.right = new PNode(30);
        root.right.left = new PNode(40);
        root.right.right = new PNode(50);

        preorder(root);
    }

    public static void preorder(PNode root) {
        if (root != null) {
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
