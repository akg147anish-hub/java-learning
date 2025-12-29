import java.util.Scanner;
public class AreaofHexagon{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the side: ");
        double side = sc.nextDouble();
        double area = (3* Math.sqrt(3)/2) * side * side;
        System.out.println("The area of the hexagon is " + area);
    }
}