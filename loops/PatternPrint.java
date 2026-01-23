import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        String pattern = "";

        for (int i = 1; i <= n; i++) {
            pattern = pattern + i + pattern;
            System.out.println(pattern);
        }

        sc.close();
    }
}
