import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {

        String str = "{[()]}";

        Stack<Character> stack = new Stack<>();

        boolean balanced = true;

        for(char ch : str.toCharArray()) {

            if(ch=='(' || ch=='{' || ch=='[') {
                stack.push(ch);
            }

            else {

                if(stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if((ch==')' && top!='(') ||
                   (ch=='}' && top!='{') ||
                   (ch==']' && top!='[')) {

                    balanced = false;
                    break;
                }
            }
        }

        if(!stack.isEmpty()) {
            balanced = false;
        }

        System.out.println(balanced);
    }
}
