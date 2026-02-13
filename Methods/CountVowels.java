import java.util.Scanner;

public class CountVowels {

    // Method to count vowels
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();  // convert to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int result = countVowels(input);

        System.out.println("Number of vowels: " + result);

        sc.close();
    }
}
