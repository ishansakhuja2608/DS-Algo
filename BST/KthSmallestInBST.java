package BST;

/*
 * Design a DS which supports search, insert, delete and kth smallest element operations
 * Insert(10), Insert(5), Insert(15), Insert(20), Insert(2)
 * Kth Smallest(3) = 10
 */

public class KthSmallestInBST {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int k = 3;

        System.out.println("Kth Sallest: ");
        printKth(root, k);
    }

    static int count = 0;

    public static void printKth(Node root, int k) {
        if (root != null) {
            printKth(root.left, k);
            count += 1;
            if (count == k) {
                System.out.println(root.key);
                return;
            }
            printKth(root.right, k);
        }
    }
}
