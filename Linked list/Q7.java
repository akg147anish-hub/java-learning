class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q7{
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = head.next;

        Node temp = head;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
