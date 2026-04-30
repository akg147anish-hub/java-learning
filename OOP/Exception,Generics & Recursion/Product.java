class Product {

    // recursive method
    static int multiply(int m, int n) {
        if (n == 0) {
            return 0; // base case
        }
        return m + multiply(m, n - 1); // recursive call
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        int m = 5;
        int n = 3;

        int result = Product.multiply(m, n);

        System.out.println("Product: " + result);
    }
}
