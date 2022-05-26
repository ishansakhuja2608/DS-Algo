package CircularLinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class DeleteHead {
    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
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
        else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
        }
        return head.next;
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
