public class MinMaxArray {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 23};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}