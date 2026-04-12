class Car {
    String brand;
    int price;

    void show() {
        System.out.println(brand + " - " + price);
    }
}

public class CarClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.price = 5000000;

        Car c2 = new Car();
        c2.brand = "Audi";
        c2.price = 4500000;

        c1.show();
        c2.show();
    }
}
