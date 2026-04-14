class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.id = 101;
        e1.name = "Anika";
        e1.salary = 50000;

        e1.display();
    }
}