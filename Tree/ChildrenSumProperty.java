package Tree;

class NodeSum {
    int data;
    NodeSum left;
    NodeSum right;

    NodeSum(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class ChildrenSumProperty {
    public static void main(String[] args) {
        NodeSum root = new NodeSum(20);
        root.left = new NodeSum(8);
        root.right = new NodeSum(12);
        root.right.left = new NodeSum(3);
        root.right.right = new NodeSum(9);

        System.out.println(isSum(root));
    }

    public static boolean isSum(NodeSum root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        int sum = 0;
        if (root.left != null)
            sum += root.left.data;
        if (root.right != null)
            sum += root.right.data;

        return (root.data == sum && isSum(root.left) && isSum(root.right));
    }
}
