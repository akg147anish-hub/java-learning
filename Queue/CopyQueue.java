import java.util.*;

public class CopyQueue {
    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);

        Queue<Integer> q2 = new LinkedList<>(q1);

        System.out.println(q2);
    }
}
