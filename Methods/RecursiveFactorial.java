import java.util.Scanner;

public class RecursiveFactorial {

    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        } else {
            int result = factorialRecursive(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        sc.close();
    }
}
