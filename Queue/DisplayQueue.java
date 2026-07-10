import java.util.*;

public class DisplayQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(5);
        q.offer(10);
        q.offer(15);
        q.offer(20);

        for (int x : q)
            System.out.println(x);
    }
}
