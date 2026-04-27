import java.util.Scanner;

public class LuckyNumberDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your lucky number: ");
            int num = sc.nextInt();

            // treat negative number as exception
            if (num < 0) {
                throw new NumberFormatException("Negative number not allowed");
            }

            System.out.println("Your lucky number is: " + num);

        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}