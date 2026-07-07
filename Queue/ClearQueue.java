import java.util.*;

public class ClearQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.clear();

        System.out.println(q);
    }
}
