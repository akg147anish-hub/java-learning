class Mobile {
    String brand;
    int price;
}

public class MobileClass {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 20000;

        Mobile m2 = new Mobile();
        m2.brand = "iPhone";
        m2.price = 80000;

        if (m1.price > m2.price) {
            System.out.println(m1.brand + " is costlier");
        } else {
            System.out.println(m2.brand + " is costlier");
        }
    }
}