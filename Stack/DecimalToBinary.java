import java.util.Stack;

public class DecimalToBinary {

    public static void main(String[] args) {

        int n = 13;

        Stack<Integer> stack = new Stack<>();

        while(n > 0) {

            stack.push(n % 2);

            n = n / 2;
        }

        while(!stack.isEmpty()) {

            System.out.print(stack.pop());
        }
    }
}
