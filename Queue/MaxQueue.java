import java.util.*;

public class MaxQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(12);
        q.offer(40);
        q.offer(8);
        q.offer(25);

        int max = Integer.MIN_VALUE;

        for (int num : q) {
            if (num > max)
                max = num;
        }

        System.out.println("Maximum = " + max);
    }
}
