package BST;

//Floor in BST: - Given the root of a BST and a key x, we need to find the floor of that given key in BST, we need to find out closest smaller or equal to value, if the value is present, we return the node with that value, if not present, we need to find out the largest value smaller than the given value and if there's no smaller value than the given value, we return null

public class FloorInBST {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 17;

        System.out.println("Floor: " + (floor(root, x).key));
    }

    public static Node floor(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x)
                return root;
            else if (root.key > x)
                root = root.left;
            else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }
}
