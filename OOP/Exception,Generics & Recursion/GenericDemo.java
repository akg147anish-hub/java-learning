public class GenericDemo {

    // Generic method
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};

        // String array
        String[] strArray = {"Java", "OOP", "Exam"};

        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3};

        // calling generic method
        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);
    }
}