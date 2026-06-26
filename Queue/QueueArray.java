class QueueArray {
    int[] queue = new int[5];
    int front = 0, rear = -1;

    void enqueue(int data) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = data;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Removed: " + queue[front++]);
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.display();
    }
}
