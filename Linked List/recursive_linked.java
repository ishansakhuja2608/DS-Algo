class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class recursive_linked {
    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(25);
        head.next.next = new Node(35);
        head.next.next.next = new Node(45);
        rPrint(head);
    }

    public static void rPrint(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data + " ");
        rPrint(head.next);

    }
}
