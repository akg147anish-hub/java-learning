import java.util.*;

public class QueueEmpty {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        if (q.isEmpty())
            System.out.println("Queue is Empty");
        else
            System.out.println("Queue is Not Empty");
    }
}
