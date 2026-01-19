import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);  // convert to lowercase

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                         ? "Vowel"
                         : "Consonant";

        System.out.println("The character is: " + result);

        sc.close();
    }
}
