class Product {
    double price;

    void applyDiscount(double percent) {
        double discount = price * percent / 100;
        price = price - discount;
        System.out.println("Final Price: " + price);
    }
}

public class ProductDiscount {
    public static void main(String[] args) {
        Product p = new Product();
        p.price = 1000;

        p.applyDiscount(10);
    }
}