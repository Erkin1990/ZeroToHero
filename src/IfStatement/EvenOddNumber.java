package IfStatement;
import java.util.Scanner;
public class EvenOddNumber {

        //TASK
        // write the if statement to find the number is even or odd

        // number remainder is 0 --> even number
        // number remainder is 1 --> odd number

        // int num=15

        // print: this is even number

    public static void main(String[] args) {

        int number=15;

        // number%2==0--even number
        // number%2==1 -- odd number

        if(number%2==0){

            System.out.println(number+" is even number");

    }else{
            System.out.println(number+" is odd number");
        }

        // loop inside the loop will print only even numbers.

        int num3=10;
        int num4=100;

        while(num3<=num4){

            // print num1 of it is even number

            if(num3 %15 ==0) {

            System.out.println(num3);


            }
            num3++;
        }



    }





















}
