public class SecondLargest {

    public static void main(String[] args) {

        int[] numbers = {10, 45, 23, 89, 67};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } 
            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}