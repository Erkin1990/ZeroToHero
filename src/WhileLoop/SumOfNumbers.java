package WhileLoop;
import java.util.Scanner;
public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println("Please enter two numbers");
        int firstNumber=input.nextInt();

        int secondNumber=input.nextInt();

        // 10 - 15
        // 10 + 11 + 12 + 13 + 14 + 15;
        int sum=0;
        while (firstNumber<=secondNumber){


             sum=sum + firstNumber;
                firstNumber++;



        }
        System.out.println(sum);

        // Debugging. It is very important.
    }




















}
