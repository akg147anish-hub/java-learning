class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class CalculatorClass {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(5, 3));
        System.out.println(cal.subtract(5, 3));
        System.out.println(cal.multiply(5, 3));
        System.out.println(cal.divide(6, 2));
    }
}