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

public class DeleteHead {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        printList(head);

        head = deleteOne(head);

        printList(head);
    }

    public static Node deleteOne(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        } else {
            head = head.next;
            head.prev = null;
            return head;
        }

    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
