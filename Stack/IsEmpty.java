import java.util.Stack;

public class IsEmpty {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(10);

        System.out.println(stack.isEmpty());
    }
}
