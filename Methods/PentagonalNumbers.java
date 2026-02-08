public class PentagonalNumbers {

    // Method to return the nth pentagonal number
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print(getPentagonalNumber(i) + " ");
            count++;

            // Print 10 numbers per line
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
