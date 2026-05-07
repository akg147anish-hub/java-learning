class SumOfDigits {

    static int sum(int n) {
        if (n == 0)
            return 0;

        return (n % 10) + sum(n / 10);
    }
}

public class SumOfDigitsRecursion {
    public static void main(String[] args) {

        int num = 1234;

        System.out.println("Sum of digits: " + SumOfDigits.sum(num));
    }
}
