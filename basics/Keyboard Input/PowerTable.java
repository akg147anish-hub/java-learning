public class PowerTable{
    public static void main (String[] args){
        System.out.println("Math.pow(a,b)");
        for(int a=1, b=2; a<=5; a++, b++){
            int power = (int) Math.pow(a,b);
            System.out.println(a+ " " + b + " " + power);

        }
    }
}