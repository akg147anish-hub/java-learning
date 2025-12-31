import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. between 0 and 1000:");
        int number = sc.nextInt();
        int sum = 0;
        while (number>0){
            sum+= number % 10;
            number = number/10;
        }
        System.out.println("The sum of the digit is" + sum);

    }
}