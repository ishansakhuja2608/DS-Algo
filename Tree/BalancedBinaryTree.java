package Tree;

class NodeBalanced {
    int data;
    NodeBalanced left;
    NodeBalanced right;

    NodeBalanced(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class BalancedBinaryTree { // the difference between heights of left subtree and right subtree should not
                                  // be more than one //
    public static void main(String[] args) {
        NodeBalanced root = new NodeBalanced(10);
        root.left = new NodeBalanced(5);
        root.right = new NodeBalanced(30);
        root.right.left = new NodeBalanced(15);
        root.right.right = new NodeBalanced(20);

        if (isBalanced(root) > 0)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    public static int isBalanced(NodeBalanced root) {
        if (root == null)
            return 0;
        int lh = isBalanced(root.left);
        if (lh == -1)
            return -1;
        int rh = isBalanced(root.right);
        if (rh == -1)
            return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;
        else
            return Math.max(lh, rh) + 1;
    }
}
