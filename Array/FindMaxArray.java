public class FindMaxArray {

    public static void main(String[] args) {

        int[] numbers = {10, 45, 23, 89, 67};

        int max = numbers[0];   // assume first element is maximum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}