import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the power: ");
        int exponent = sc.nextInt();

        int result = 1;

        // Calculate power using loop
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println(base + " to the power " + exponent + " is: " + result);

        sc.close();
    }
}
