import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + factorial(digit);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number.");
        } else {
            System.out.println(original + " is not a Strong number.");
        }

        sc.close();
    }

    // Method to find factorial of a digit
    static int factorial(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
