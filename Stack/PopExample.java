import java.util.Stack;

public class PopExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Before: " + stack);

        stack.pop();

        System.out.println("After: " + stack);
    }
}
