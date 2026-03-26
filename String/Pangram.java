import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        boolean isPangram = true;

        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(str.indexOf(ch) == -1) {
                isPangram = false;
                break;
            }
        }

        if(isPangram) {
            System.out.println("It is a Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}
