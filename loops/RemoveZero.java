import java.util.Scanner;

public class RemoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int newNumber = 0;
        int place = 1;

        while (number > 0) {
            int digit = number % 10;

            if (digit != 0) {
                newNumber = newNumber + digit * place;
                place = place * 10;
            }

            number = number / 10;
        }

        System.out.println("After removing 0 from number " + originalNumber +
                ", the new number is");
        System.out.println(newNumber);

        sc.close();
    }
}
