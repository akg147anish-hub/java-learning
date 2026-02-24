public class FindMinArray {

    public static void main(String[] args) {

        int[] numbers = {10, 45, 23, 89, 5, 67};

        int min = numbers[0];   // assume first element is minimum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}