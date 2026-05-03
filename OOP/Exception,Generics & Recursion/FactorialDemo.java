class Factorial {

    // recursive method
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * fact(n - 1); // recursive call
    }
}

public class FactorialDemo {
    public static void main(String[] args) {

        int n = 5;

        int result = Factorial.fact(n);

        System.out.println("Factorial of " + n + " is: " + result);
    }
}
