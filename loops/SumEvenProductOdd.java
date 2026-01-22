import java.util.Scanner;

public class SumEvenProductOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sumEven = 0;
        long productOdd = 1;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                productOdd *= i;
            }
        }

        System.out.println("Sum of all even numbers = " + sumEven);
        System.out.println("Product of all odd numbers = " + productOdd);

        sc.close();
    }
}
