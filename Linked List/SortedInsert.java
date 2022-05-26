class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class SortedInsert {
    public static void main(String[] args) {
        Node head = null;
        head = sortInsert(head, 10);
        head = sortInsert(head, 30);
        head = sortInsert(head, 40);
        head = sortInsert(head, 20);
        printlist(head);

    }

    static Node sortInsert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null)
            return temp;
        if (data < head.data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < data) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static void printlist(Node head) {
        if (head == null)
            return;
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
