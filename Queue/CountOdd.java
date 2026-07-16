import java.util.*;

public class CountOdd {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(5);
        q.offer(10);
        q.offer(7);
        q.offer(8);
        q.offer(9);

        int count = 0;

        for (int num : q) {
            if (num % 2 != 0)
                count++;
        }

        System.out.println("Odd Numbers = " + count);
    }
}
