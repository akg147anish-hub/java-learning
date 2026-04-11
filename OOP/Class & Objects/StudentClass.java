class Student {
    String name;
    int rollNo;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anish";
        s1.rollNo = 1;
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.rollNo = 2;
        s2.marks = 85;

        s1.display();
        s2.display();
    }
}