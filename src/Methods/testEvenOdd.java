package Methods;
import java.util.Scanner;
public class testEvenOdd {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println("Please enter your number");

        int number=input.nextInt();

        EvenOdd evenOdd=new EvenOdd();
        System.out.println("Your number is even: "+evenOdd.isEven(number));
        System.out.println("Your number is odd: "+evenOdd.isOdd(number));
    }
}
