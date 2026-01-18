import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            System.out.println("The triangle is Equilateral.");
        } 
        else if (a == b || b == c || a == c) {
               System.out.println("The triangle is Isosceles.");
        } 
        else {
            System.out.println("The triangle is Scalene.");
        }

        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        sc.close();
    }
}
