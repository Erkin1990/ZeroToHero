package IfStatement;
import javax.swing.*;
import java.util.Scanner;
public class NumberRange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");

        int number = input.nextInt();

        if (number >= 40 && number <= 10) {

            for (int i = number; i <= 40; i++) {

                System.out.println(i);}

                // Interview
                // What is the difference between defininf the variable
                // and declaring the variable
                // int number; --> declaring the variable
                // number=10; ---> defining hte variable. Initialization of the variable

                System.out.println(number + "is in the range");
            }else{
                System.out.println(number + "is not in the range");
            }
            // The number is in the range ( give number between 10 to 40 )
            // The number is not in the range ( give number out of 10-40 )
            // Upper limit 40, Lower limit 10
        }
    }



