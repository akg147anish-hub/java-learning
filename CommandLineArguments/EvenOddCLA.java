public class EvenOddCLA {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Enter any no.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
