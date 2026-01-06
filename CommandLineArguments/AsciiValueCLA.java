public class AsciiValueCLA{
    public static void main(String[] args) {
        if (args.length ==0){
            System.out.println("Enter a character");
            return;
        }
        char ch = args[0].charAt(0);
        int ascii = ch;
        System.out.println("Character:" + ch);
        System.out.println("ASCII value: " + ascii);

    }
}