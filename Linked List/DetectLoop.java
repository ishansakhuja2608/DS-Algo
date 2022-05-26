//////////////// Using a dummy Node and canging the next of every node to the dummy node ////////////////////////////////

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class DetectLoop {
    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
        if (isLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }

    static boolean isLoop(Node head) {
        Node temp = new Node(0);
        Node curr = head;
        while (curr != null) {
            if (curr.next == null)
                return false;
            if (curr.next == temp)
                return true;
            Node curr_next = curr.next;
            curr.next = temp;
            curr = curr_next;
        }
        return false;
    }

}
