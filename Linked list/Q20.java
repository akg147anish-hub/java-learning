class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q20 {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(50);

        int key = 50;

        boolean found = false;

        Node temp = head;

        while(temp != null) {

            if(temp.data == key) {
                found = true;
                break;
            }

            temp = temp.next;
        }

        if(found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
