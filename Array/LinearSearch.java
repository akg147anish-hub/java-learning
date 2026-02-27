public class LinearSearch {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 30, 45, 50};
        int key = 30;   // element to search

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                index = i;
                break;   // stop loop when element is found
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}