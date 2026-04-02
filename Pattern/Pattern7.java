public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        // Upper pyramid
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower pyramid
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}