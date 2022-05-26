package CircularLinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class DeleteLast {
    public static void main(String[] args) {
        Node head = new Node(45);
        head.next = new Node(55);
        head.next.next = new Node(75);
        head.next.next.next = head;
        printList(head);
        head = delLast(head);
        printList(head);
    }

    static Node delLast(Node head) {
        if (head == null)
            return null;
        if (head.next == head)
            return null;
        else {
            Node curr = head;
            while (curr.next.next != head) {
                curr = curr.next;
            }
            curr.next = head;
        }
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
