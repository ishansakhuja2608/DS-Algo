package BST;

// We are given a key and root of a BST, we need to find the ceiling of the given key in the BST. We need to find a value in BST which is greater than or equal to the given key and we need to find out smallest such value
class Ceil {
    public static Node ceil(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x)
                return root;
            else if (root.key < x)
                root = root.right;
            else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }
}

public class CeilInBST {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 17;
        System.out.println("Ceil: " + (Ceil.ceil(root, x).key));
    }
}
