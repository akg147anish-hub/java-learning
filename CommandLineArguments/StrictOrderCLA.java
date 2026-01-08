public class StrictOrderCLA {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Please provide three numbers");
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean result = (x < y && y < z) || (x > y && y > z);

        System.out.println("Strict Order Check " + x + " " + y + " " + z + " ----> " + result);
    }
}
