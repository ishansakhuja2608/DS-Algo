class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class InsertAtBegin {
    static Node insetBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insetBegin(head, 75);
        head = insetBegin(head, 20);
        head = insetBegin(head, 10);
        printList(head);
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
