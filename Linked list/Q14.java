class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q14 {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(21);
        head.next.next = new Node(30);
        head.next.next.next = new Node(45);
        head.next.next.next.next = new Node(50);

        int count = 0;

        Node temp = head;

        while(temp != null) {

            if(temp.data % 2 != 0) {
                count++;
            }

            temp = temp.next;
        }

        System.out.println("Odd Nodes = " + count);
    }
}
