public class FindMissingNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5};

        int n = numbers.length + 1;   // because one number is missing

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            actualSum += numbers[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}