class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q9 {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(70);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int max = head.data;

        Node temp = head;

        while(temp != null) {

            if(temp.data > max) {
                max = temp.data;
            }

            temp = temp.next;
        }

        System.out.println("Maximum = " + max);
    }
}
