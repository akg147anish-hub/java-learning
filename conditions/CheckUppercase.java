import java.util.Scanner;

public class CheckUppercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is an uppercase letter.");
        } else {
            System.out.println("The character is not an uppercase letter.");
        }

        sc.close();
    }
}
