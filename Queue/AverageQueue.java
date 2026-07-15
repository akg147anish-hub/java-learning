import java.util.*;

public class AverageQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        int sum = 0;

        for (int num : q)
            sum += num;

        double avg = (double) sum / q.size();

        System.out.println("Average = " + avg);
    }
}
