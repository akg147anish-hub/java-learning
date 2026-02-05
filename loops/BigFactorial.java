import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        BigInteger fact = BigInteger.ONE;
        int i = 1;

        while (i <= n) {
            fact = fact.multiply(BigInteger.valueOf(i));
            i++;
        }

        System.out.println("Factorial of " + n + " is:");
        System.out.println(fact);

        sc.close();
    }
}
