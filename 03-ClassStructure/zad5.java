import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        //a.	The larger of two numbers: 34 and 49
        int largerNumber = Math.max(34, 39);
        //b.	PI number
        double Pi = Math.PI;
        //c.	Absolute value of -17
        int abs = Math.abs(-17);
        //d.	Square root of the expression: nine divided by two
        double square_root = 9/2.0;
        double square_root1 = Math.sqrt(square_root);
        //e.	Random number in the range <0.0,1.0)
        double random = Math.random();
        //f.	Integer random number in the range <0,10>
        Random randomnumber1 = new Random();
        int randomNumber = randomnumber1.nextInt(11);
        //g.	Sine of 90 degrees
        double radians = Math.toRadians(90);
        double sineValue = Math.sin(radians);

        









        System.out.println(largerNumber);
        System.out.println(Pi);
        System.out.println(abs);
        System.out.println(square_root1);
        System.out.println(random);
        System.out.println(randomNumber);
        System.out.println(sineValue);
    }
}