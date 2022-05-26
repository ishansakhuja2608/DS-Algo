package Tree;

class Nodee {
    int key;
    Nodee left;
    Nodee right;

    Nodee(int k) {
        key = k;
        left = null;
        right = null;
    }
}

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        Nodee root = new Nodee(10);
        root.left = new Nodee(20);
        root.right = new Nodee(30);
        root.right.left = new Nodee(40);
        root.right.right = new Nodee(50);

        System.out.println(height(root));
    }

    public static int height(Nodee root) {
        if (root == null)
            return 0;
        else
            return (1 + Math.max(height(root.left), height(root.right)));
    }
}