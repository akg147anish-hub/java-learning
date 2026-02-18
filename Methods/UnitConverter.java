import java.util.Scanner;

public class UnitConverter {

    // Centimeter to Meter
    public static double cmToMeter(double cm) {
        return cm / 100;
    }

    // Meter to Centimeter
    public static double meterToCm(double m) {
        return m * 100;
    }

    // Kilometer to Meter
    public static double kmToMeter(double km) {
        return km * 1000;
    }

    // Meter to Kilometer
    public static double meterToKm(double m) {
        return m / 1000;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- UNIT CONVERTER -----");
            System.out.println("1. Centimeter to Meter");
            System.out.println("2. Meter to Centimeter");
            System.out.println("3. Kilometer to Meter");
            System.out.println("4. Meter to Kilometer");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value in cm: ");
                    double cm = sc.nextDouble();
                    System.out.println("In meters: " + cmToMeter(cm));
                    break;

                case 2:
                    System.out.print("Enter value in meter: ");
                    double m1 = sc.nextDouble();
                    System.out.println("In centimeters: " + meterToCm(m1));
                    break;

                case 3:
                    System.out.print("Enter value in km: ");
                    double km = sc.nextDouble();
                    System.out.println("In meters: " + kmToMeter(km));
                    break;

                case 4:
                    System.out.print("Enter value in meter: ");
                    double m2 = sc.nextDouble();
                    System.out.println("In kilometers: " + meterToKm(m2));
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 5);

        sc.close();
    }
}
