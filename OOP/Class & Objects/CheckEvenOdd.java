class Number {
    int num;

    void checkEvenOdd() {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

public class CheckEvenOdd {
    public static void main(String[] args) {
        Number n = new Number();
        n.num = 7;

        n.checkEvenOdd();
    }
}