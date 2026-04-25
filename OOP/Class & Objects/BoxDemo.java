class Box {
    int length, breadth;

    Box() {
        length = 1;
        breadth = 1;
    }

    Box(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5, 4);

        System.out.println(b1.area());
        System.out.println(b2.area());
    }
}