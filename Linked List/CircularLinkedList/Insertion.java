package CircularLinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Insertion {
    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head, 5);
        head = insertBegin(head, 10);
        head = insertBegin(head, 15);
        printList(head);

    }

    static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        if (head == null)
            temp.next = temp;
        else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }

    public static void printList(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next)
            System.out.print(r.data + " ");
    }
}
