package Tree;

class NodeC {
    int data;
    NodeC left;
    NodeC right;

    NodeC(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class ConstructBinaryTree { // pre-orer andin-order traversal are given //
    public static void main(String[] args) {
        int in[] = { 20, 10, 40, 30, 50 };
        int pre[] = { 10, 20, 30, 40, 50 };
        int n = in.length;

        NodeC root = cTree(in, pre, 0, n - 1);

        inorder(root);
    }

    static int preIndex = 0;

    public static NodeC cTree(int in[], int pre[], int is, int ie) {
        if (is > ie)
            return null;
        NodeC root = new NodeC(pre[preIndex++]);

        int inIndex = is;
        for (int i = is; i <= ie; i++) {
            if (in[i] == root.data) {
                inIndex = i;
                break;
            }
        }
        root.left = cTree(in, pre, is, inIndex - 1);
        root.right = cTree(in, pre, inIndex + 1, ie);
        return root;
    }

    public static void inorder(NodeC root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
