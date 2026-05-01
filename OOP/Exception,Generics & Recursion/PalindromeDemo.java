class Palindrome {

    // recursive method
    static boolean isPalindrome(String s) {
        // base case
        if (s.length() <= 1) {
            return true;
        }

        // check first and last character
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // recursive call (substring)
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}

public class PalindromeDemo {
    public static void main(String[] args) {

        String str = "racecar";

        if (Palindrome.isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
