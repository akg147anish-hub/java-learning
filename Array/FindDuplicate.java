public class FindDuplicate {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 2, 2};

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate element: " + numbers[i]);
                    found = true;
                    break;
                }

            }

            if (found) {
                break;
            }

        }

        if (!found) {
            System.out.println("No duplicate element found");
        }
    }
}