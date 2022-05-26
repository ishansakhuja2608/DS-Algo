package Tree;

class INode { ///// O(n) ///// O(h) h - height of tree
    int key;
    INode left;
    INode right;

    INode(int key) {
        this.key = key;
        left = null;
        right = null;
    }
}

public class InorderImplementation {

    public static void main(String args[]) {
        INode root = new INode(10);
        root.left = new INode(20);
        root.right = new INode(30);
        root.right.left = new INode(40);
        root.right.right = new INode(50);

        inorder(root);
    }

    public static void inorder(INode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}