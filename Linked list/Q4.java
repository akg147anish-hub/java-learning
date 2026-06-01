class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q4 {

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);

        Node newNode = new Node(5);

        newNode.next = head;

        head = newNode;

        Node temp = head;

        while(temp != null) {

            System.out.println(temp.data);

            temp = temp.next;
        }
    }
}
