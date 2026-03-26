public class FrequencyOfNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 2};
        int key = 2;

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == key) {
                count++;
            }

        }

        System.out.println("Frequency of " + key + " is: " + count);
    }
}