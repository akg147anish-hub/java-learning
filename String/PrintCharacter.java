import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Characters in new lines:");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        sc.close();
    }
}
