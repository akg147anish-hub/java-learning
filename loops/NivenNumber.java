import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        // Calculate sum of digits using while loop
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        // Check Niven number
        if (original % sum == 0) {
            System.out.println(original + " is a Niven number.");
        } else {
            System.out.println(original + " is not a Niven number.");
        }

        sc.close();
    }
}
