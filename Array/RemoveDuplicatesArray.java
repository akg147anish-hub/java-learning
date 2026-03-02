public class RemoveDuplicatesArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        int n = numbers.length;

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}