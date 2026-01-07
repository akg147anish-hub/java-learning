public class TrigoExpressionCLA {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a value for t");
            return;
        }

        double t = Double.parseDouble(args[0]);

        double result = Math.cos(5 * t) + Math.sin(7 * t);

        System.out.println("cos(5*" + t + ") + sin(7*" + t + ") = " + result);
    }
}
