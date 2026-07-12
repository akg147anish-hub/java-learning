import java.util.*;

public class CountPositiveNegative {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(-5);
        q.offer(20);
        q.offer(-8);
        q.offer(15);

        int positive = 0;
        int negative = 0;

        for (int num : q) {
            if (num >= 0)
                positive++;
            else
                negative++;
        }

        System.out.println("Positive Numbers = " + positive);
        System.out.println("Negative Numbers = " + negative);
    }
}
