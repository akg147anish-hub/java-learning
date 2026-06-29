import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty())
            stack.push(q.poll());

        while (!stack.isEmpty())
            q.offer(stack.pop());

        System.out.println(q);
    }
}
