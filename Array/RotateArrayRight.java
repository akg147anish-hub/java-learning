public class RotateArrayRight {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int n = numbers.length;

        // Store last element
        int last = numbers[n - 1];

        // Shift elements to right
        for (int i = n - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        // Place last element at first position
        numbers[0] = last;

        System.out.println("Array after right rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}