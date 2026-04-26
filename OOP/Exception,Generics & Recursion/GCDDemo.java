class GCD {

    // recursive method
    static int gcd(int m, int n) {
        if (n == 0) {
            return m; // base case
        }
        return gcd(n, m % n); // recursive call
    }
}

public class GCDDemo {
    public static void main(String[] args) {

        int m = 48;
        int n = 18;

        int result = GCD.gcd(m, n);

        System.out.println("GCD of " + m + " and " + n + " is: " + result);
    }
}