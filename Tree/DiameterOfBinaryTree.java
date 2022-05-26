package Tree;

public class DiameterOfBinaryTree {// number of nodes on the lngst path b/w 2 leaf nodes//precompute and store in
                                   // hashmap<Node, int>
    public static void main(String[] args) {

    }
}

/*
 * Naive
 * public static int height(Node root) {
 * if(root = null)
 * return 0;
 * else
 * return (1+Math.max(height(root.legt), height(root.right)));
 * }
 * public static int diameter(Node root) {
 * if(root == null)
 * return 0;
 * int d1 = 1+height(root.left) + height(root.right);
 * int d2 = diameter(root.left);
 * int d3 = diameter(root.right);
 * 
 * return Math.max(d1, Math.max(d2,d3));
 * }
 */