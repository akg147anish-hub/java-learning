class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q18 {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node temp = head;

        while(temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Second Last = " + temp.data);
    }
}
