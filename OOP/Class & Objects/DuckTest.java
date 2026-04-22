interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    String name;

    // constructor
    Duck(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("Duck can fly");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }

    void displayDetails() {
        System.out.println("Duck Name: " + name);
        System.out.println("Abilities: Flying and Swimming");
    }
}

public class DuckTest {
    public static void main(String[] args) {

        Duck d = new Duck("Donald");

        d.fly();
        d.swim();
        d.displayDetails();
    }
}