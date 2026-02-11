import java.util.Scanner;

public class MultiplicationTable {

    // Method to print multiplication table
    public static void printTable(int num) {
        System.out.println("Multiplication Table of " + num + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        printTable(number);   

        sc.close();
    }
}
