import java.util.Scanner;

public class SimpleCalculator {

    // Addition
    public static int additionSimple(int x, int y) {
        return x + y;
    }

    // Subtraction (y - x)
    public static int subtractionSimple(int x, int y) {
        return y - x;
    }

    // Multiplication
    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    // Division (y / x)
    public static double divisionSimple(int x, int y) {
        if (x == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) y / x;
    }

    // Remainder
    public static int remainderSimple(int n, int m) {
        return n % m;
    }

    // Square Root
    public static double squareRootSimple(int n) {
        if (n < 0) {
            throw new ArithmeticException("Negative number");
        }
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- SIMPLE CALCULATOR -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Square Root");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter first number (x): ");
                        int x1 = sc.nextInt();
                        System.out.print("Enter second number (y): ");
                        int y1 = sc.nextInt();
                        System.out.println("Result (x + y) = " +
                                additionSimple(x1, y1));
                        break;

                    case 2:
                        System.out.print("Enter first number (x): ");
                        int x2 = sc.nextInt();
                        System.out.print("Enter second number (y): ");
                        int y2 = sc.nextInt();
                        System.out.println("Result (y - x) = " +
                                subtractionSimple(x2, y2));
                        break;

                    case 3:
                        System.out.print("Enter first number (x): ");
                        int x3 = sc.nextInt();
                        System.out.print("Enter second number (y): ");
                        int y3 = sc.nextInt();
                        System.out.println("Result (x * y) = " +
                                multiplicationSimple(x3, y3));
                        break;

                    case 4:
                        System.out.print("Enter first number (x): ");
                        int x4 = sc.nextInt();
                        System.out.print("Enter second number (y): ");
                        int y4 = sc.nextInt();
                        System.out.println("Result (y / x) = " +
                                divisionSimple(x4, y4));
                        break;

                    case 5:
                        System.out.print("Enter first number (n): ");
                        int n = sc.nextInt();
                        System.out.print("Enter second number (m): ");
                        int m = sc.nextInt();
                        System.out.println("Result (n % m) = " +
                                remainderSimple(n, m));
                        break;

                    case 6:
                        System.out.print("Enter number for square root: ");
                        int num = sc.nextInt();
                        System.out.println("Result = " +
                                squareRootSimple(num));
                        break;

                    case 7:
                        System.out.println("Exiting... Thank you!");
                        break;

                    default:
                        System.out.println("Invalid option! Try again.");
                }
            } catch (ArithmeticException e) {
                if (choice == 4) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else if (choice == 6) {
                    System.out.println("Error! Square root of a negative number is not allowed.");
                }
            }

        } while (choice != 7);

        sc.close();
    }
}
