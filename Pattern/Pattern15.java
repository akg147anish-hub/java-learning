public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // binary numbers
            for(int j = 1; j <= i; j++) {
                if((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }

            System.out.println();
        }
    }
}