import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total units consumed:");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;
        }

        System.out.println("Total Electricity Bill = Rs. " + bill);

        sc.close();
    }
}
