class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printlist(head);
        System.out.print("Position of Middle Node is : ");
        printMiddle(head);

    }

    static void printMiddle(Node head) {
        if (head == null)
            return;
        int count = 0;
        Node curr;
        for (curr = head; curr != null; curr = curr.next)
            count++;
        curr = head;
        for (int i = 0; i < count / 2; i++)
            curr = curr.next;
        System.out.println(curr.data);
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
