import java.util.*;

public class SumQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        int sum = 0;

        for (int x : q)
            sum += x;

        System.out.println("Sum = " + sum);
    }
}
