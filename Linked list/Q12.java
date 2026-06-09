class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q12 {

    public static void main(String[] args) {

        Node head = new Node(40);
        head.next = new Node(10);
        head.next.next = new Node(70);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(20);

        int min = head.data;

        Node temp = head;

        while(temp != null) {

            if(temp.data < min) {
                min = temp.data;
            }

            temp = temp.next;
        }

        System.out.println("Minimum = " + min);
    }
}
