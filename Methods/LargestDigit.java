import java.util.Scanner;

public class LargestDigit {

    // Method to find the largest digit in an integer
    public static int largestDigit(int n) {
        n = Math.abs(n);   // handle negative numbers
        int max = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            n = n / 10;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result = largestDigit(num);

        System.out.println("Largest digit: " + result);

        sc.close();
    }
}
