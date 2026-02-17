import java.util.Scanner;

public class TemperatureConverter {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- TEMPERATURE CONVERTER -----");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double c = sc.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " +
                            celsiusToFahrenheit(c));
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double f = sc.nextDouble();
                    System.out.println("Temperature in Celsius: " +
                            fahrenheitToCelsius(f));
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 3);

        sc.close();
    }
}
