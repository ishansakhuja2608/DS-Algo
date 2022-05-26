package Tree;

class NodeDLL {
    int data;
    NodeDLL left;
    NodeDLL right;

    NodeDLL(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class BinaryTreeToDLL {
    public static void main(String[] args) {
        NodeDLL root = new NodeDLL(10);
        root.left = new NodeDLL(5);
        root.right = new NodeDLL(20);
        root.right.left = new NodeDLL(30);
        root.right.right = new NodeDLL(35);

        NodeDLL head = BTToDLL(root);
        printList(head);
    }

    static NodeDLL prev = null;

    public static NodeDLL BTToDLL(NodeDLL root) {
        if (root == null)
            return root;
        NodeDLL head = BTToDLL(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTToDLL(root.right);
        return head;
    }

    public static void printList(NodeDLL head) {
        NodeDLL curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
}