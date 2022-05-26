package CircularLinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Traversal {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        printList(head);
    }

    static void printList(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next)
            System.out.print(r.data + " ");
    }
}
