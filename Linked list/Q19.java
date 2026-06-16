class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Q19 {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int sum = 0;
        int count = 0;

        Node temp = head;

        while(temp != null) {

            sum += temp.data;
            count++;

            temp = temp.next;
        }

        double avg = (double)sum / count;

        System.out.println("Average = " + avg);
    }
}
