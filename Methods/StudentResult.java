import java.util.Scanner;

public class StudentResult {

    // Method to calculate total marks
    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    // Method to calculate percentage
    public static double calculatePercentage(int total) {
        return total / 3.0;
    }

    // Method to calculate grade
    public static String calculateGrade(double percentage) {
        if (percentage >= 90)
            return "A";
        else if (percentage >= 75)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 40)
            return "D";
        else
            return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3);
        double percentage = calculatePercentage(total);
        String grade = calculateGrade(percentage);

        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
