import java.util.Scanner;

public class GCD_Euclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        int a = x;
        int b = y;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("GCD of " + x + " and " + y + " is " + a + ".");

        sc.close();
    }
}
