package BST;

public class Search {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 805;
        System.out.println("---------------------------------------------");
        if (searchInBST(root, x))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        System.out.println("---------------------------------------------");
    }

    private static boolean searchInBST(Node root, int x) {
        if (root == null)
            return false;
        if (root.key == x)
            return true;
        if (root.key > x)
            return searchInBST(root.left, x);
        else
            return searchInBST(root.right, x);
    }
}
