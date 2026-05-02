class ReverseString {

    // recursive method
    static String reverse(String s) {
        // base case
        if (s.length() <= 1) {
            return s;
        }

        // recursive step
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }
}

public class ReverseStringDemo {
    public static void main(String[] args) {

        String str = "pots&pans";

        String result = ReverseString.reverse(str);

        System.out.println("Reversed: " + result);
    }
}
