package DoublyLinkedList;

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
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);

        printList(head);

    }

    public static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
