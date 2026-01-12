import java.util. Scanner;
public class VotingEligibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are eligible to caste your vote");
        }
        sc.close();
    }
}