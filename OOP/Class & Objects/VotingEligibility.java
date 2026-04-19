class Person {
    String name;
    int age;

    void checkVotingEligibility() {
        if (age >= 18) {
            System.out.println(name + " can vote");
        } else {
            System.out.println(name + " cannot vote");
        }
    }
}

public class VotingEligibility{
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Rahul";
        p.age = 17;

        p.checkVotingEligibility();
    }
}