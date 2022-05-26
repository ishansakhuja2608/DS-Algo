package CircularLinkedList.Doublyy;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}

public class Insertion {
    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head, 60);
        head = insertBegin(head, 50);
        head = insertBegin(head, 40);
        head = insertBegin(head, 20);
        printlist(head);
    }

    static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        return temp;
    }

    public static void printlist(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }
}
