public class DiceSum {
    public static void main(String[] args) {

        int firstDie = (int)(Math.random() * 6) + 1;
        int secondDie = (int)(Math.random() * 6) + 1;

        int sum = firstDie + secondDie;

        System.out.println("First die: " + firstDie);
        System.out.println("Second die: " + secondDie);
        System.out.println("Sum: " + sum);
    }
}
