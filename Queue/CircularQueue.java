class CircularQueue {

    int[] arr = new int[5];
    int front = -1, rear = -1;

    void enqueue(int data) {

        if ((rear + 1) % arr.length == front) {
            System.out.println("Full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % arr.length;
        arr[rear] = data;
    }

    void dequeue() {

        if (front == -1) {
            System.out.println("Empty");
            return;
        }

        System.out.println(arr[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
    }
}
