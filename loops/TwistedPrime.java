import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse = 0;
        int temp = n;

        // Reverse the number
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        boolean isPrime1 = isPrime(n);
        boolean isPrime2 = isPrime(reverse);

        if (isPrime1 && isPrime2) {
            System.out.println(n + " is twisted prime.");
        } else {
            System.out.println(n + " is not a twisted prime.");
        }

        sc.close();
    }

    // Method to check prime number
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0)
                return false;
            i++;
        }
        return true;
    }
}
