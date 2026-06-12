class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q15 {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 3;

        Node temp = head;

        int count = 1;

        while(temp != null && count < n) {

            temp = temp.next;
            count++;
        }

        if(temp != null) {
            System.out.println("Node = " + temp.data);
        }
        else {
            System.out.println("Position does not exist");
        }
    }
}
