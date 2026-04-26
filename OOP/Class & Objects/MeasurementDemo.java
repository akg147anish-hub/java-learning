class Distance {
    int feet;
    int inches;

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
    void displayDistance() {
        System.out.println("Distance: " + feet + "' " + inches + "\"");
    }
}
class Measurement extends Distance {
    double centimetres;

    Measurement(int feet, int inches, double centimetres) {
        super(feet, inches); // call base class constructor
        this.centimetres = centimetres;
    }
    void displayMeasurement() {
        super.displayDistance(); // call base class method
        System.out.println("Distance in cm: " + centimetres);
    }
}
public class MeasurementDemo {
    public static void main(String[] args) {

        Measurement m = new Measurement(5, 8, 172.72);

        m.displayMeasurement();
    }
}