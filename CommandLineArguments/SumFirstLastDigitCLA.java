public class SumFirstLastDigitCLA {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a four-digit number");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a valid four-digit number");
            return;
        }

        int lastDigit = num % 10;
        int firstDigit = num / 1000;

        int sum = firstDigit + lastDigit;

        System.out.println("Sum of the first and last digit of " + num + " is: " + sum);
    }
}
