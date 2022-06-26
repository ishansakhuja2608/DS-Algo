package BST;

/*
 * First efficient -> 
 * Pass a range for every node
 * For root, range is -inf to +inf
 * For left child of the root, in range, we change upper bound as the node's value
 * for right child of the root, in range, we change lower bound as the node's value
 * 
 * A binary tree can be a BST if and only if its inorder traversal is sorted
 */

public class CheckForBST {

    public static boolean isBST1(Node root, int min, int max) {
        if (root == null)
            return true;

        return (root.key > min && root.key < max && isBST1(root.left, min, root.key)
                && isBST1(root.right, root.key, max));
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        if (isBST(root)) {
            System.out.println("Is BST");
        } else {
            System.out.println("Not a BST");
        }

        // if (isBST1(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
        // System.out.println("Is BST");
        // } else {
        // System.out.println("Not a BST");
        // }
    }

    static int previous = Integer.MIN_VALUE;

    public static boolean isBST(Node root) {
        if (root == null)
            return true;

        if (isBST(root.left) == false)
            return false;

        if (root.key <= previous)
            return false;

        previous = root.key;

        return isBST(root.right);
    }
}
