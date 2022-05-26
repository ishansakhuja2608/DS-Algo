package CircularLinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class DeleteHeadEff {
    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(25);
        head.next.next = new Node(65);
        head.next.next.next = head;
        printList(head);
        head = delHead(head);
        printList(head);
    }

    static Node delHead(Node head) {
        if (head == null)
            return null;
        if (head.next == head)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static void printList(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next)
            System.out.print(r.data + " ");
        System.out.println();
    }
}
