class Q6 {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Main {

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);

        head.next.next = new Node(30);

        int key = 20;

        Node temp = head;

        boolean found = false;

        while(temp != null) {

            if(temp.data == key) {

                found = true;

                break;
            }

            temp = temp.next;
        }

        if(found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
