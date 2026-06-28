import java.util.ArrayDeque;

public class QueueDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.offer(5);
        q.offer(15);
        q.offer(25);

        System.out.println(q.peek());
        q.poll();

        System.out.println(q);
    }
}
