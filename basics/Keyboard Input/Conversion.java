import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        // Conversions
        double meters = km * 1000;
        double centimeters = meters * 100;
        double feet = meters * 3.28084;
        double inches = centimeters / 2.54;

        // Output
        System.out.println("Distance in meters = " + meters);
        System.out.println("Distance in centimeters = " + centimeters);
        System.out.println("Distance in feet = " + feet);
        System.out.println("Distance in inches = " + inches);
    }
}
