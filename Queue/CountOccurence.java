import java.util.*;

public class CountOccurrence {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(10);
        q.offer(30);
        q.offer(10);
        q.offer(40);

        int target = 10;
        int count = 0;

        for (int num : q) {
            if (num == target)
                count++;
        }

        System.out.println(target + " appears " + count + " times.");
    }
}
