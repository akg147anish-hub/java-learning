import java.util.*;

public class BinaryNumbers {

    public static void main(String[] args) {

        int n = 5;

        Queue<String> q = new LinkedList<>();

        q.offer("1");

        for (int i = 0; i < n; i++) {
            String s = q.poll();
            System.out.println(s);

            q.offer(s + "0");
            q.offer(s + "1");
        }
    }
}
