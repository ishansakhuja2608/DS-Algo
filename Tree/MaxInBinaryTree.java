package Tree;

class TreeNode1 {
    int data;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class MaxInBinaryTree {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(10);
        root.left = new TreeNode1(20);
        root.right = new TreeNode1(30);
        root.left.left = new TreeNode1(40);
        root.left.right = new TreeNode1(50);
        root.right.right = new TreeNode1(60);

        System.out.println(maxPrint(root));
    }

    public static int maxPrint(TreeNode1 root) {
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.data, Math.max(maxPrint(root.left), maxPrint(root.right)));
    }
}
