package CircularLinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class InsertEnd {
    public static void main(String[] args) {
        Node head = null;
        head = endInsert(head, 10);
        printList(head);
        head = endInsert(head, 20);
        printList(head);
        head = endInsert(head, 30);
        printList(head);
    }

    static Node endInsert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            temp.next = temp;
            return head;
        }
        if (head.next == head) {
            head.next = temp;
            temp.next = head;
            return head;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }

    static void printList(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
        System.out.println();
    }
}
