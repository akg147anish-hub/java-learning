class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q3 {

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        int count = 0;

        Node temp = first;

        while(temp != null) {

            count++;

            temp = temp.next;
        }

        System.out.println("Total Nodes = " + count);
    }
}
