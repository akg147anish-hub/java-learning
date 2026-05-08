class ArraySum {

    static int sum(int arr[], int n) {
        if (n == 0)
            return 0;

        return arr[n - 1] + sum(arr, n - 1);
    }
}

public class ArraySumRecursion {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Array Sum: " + ArraySum.sum(arr, arr.length));
    }
}
