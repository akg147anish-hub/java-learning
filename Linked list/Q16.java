class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q16 {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int key = 30;
        int pos = 1;

        Node temp = head;

        while(temp != null) {

            if(temp.data == key) {
                System.out.println("Position = " + pos);
                break;
            }

            pos++;
            temp = temp.next;
        }
    }
}
