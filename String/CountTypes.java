public class CountTypes {
    public static void main(String[] args) {
        String str = "Java 123 Programming";

        int letters = 0, digits = 0, spaces = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isLetter(ch)) letters++;
            else if(Character.isDigit(ch)) digits++;
            else if(Character.isSpaceChar(ch)) spaces++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
