import java.util.*;

public class MultiplesOfFive {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(13);
        q.offer(20);
        q.offer(22);

        for (int num : q) {
            if (num % 5 == 0)
                System.out.println(num);
        }
    }
}
