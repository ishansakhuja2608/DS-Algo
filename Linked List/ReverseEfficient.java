class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class ReverseEfficient {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
        head = revlist(head);
        printlist(head);
    }

    static Node revlist(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; ///////// prev is the new head
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