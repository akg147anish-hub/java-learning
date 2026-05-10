class MaxElement {

    static int max(int arr[], int n) {

        if (n == 1)
            return arr[0];

        return Math.max(arr[n - 1], max(arr, n - 1));
    }
}

public class MaxElementRecursion {
    public static void main(String[] args) {

        int arr[] = {10, 45, 22, 99, 15};

        System.out.println("Maximum Element: " + MaxElement.max(arr, arr.length));
    }
}
