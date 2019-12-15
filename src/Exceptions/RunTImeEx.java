package Exceptions;

import ScannerPackage.ScannerDayTwo;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class RunTImeEx {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 4};

        System.out.println(numbers[2]);
        try {
            System.out.println(numbers[3]); // RunTime exception appears
        } catch (Exception exception) {
            System.out.println("This code throws an exception");
        }


        //ARITHMETIC EXCEPTION

        Scanner input = new Scanner(System.in);
        System.out.println("Hey, enter two numbers which you want to divide");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
        System.out.println("Your code is finished");

        String name = null;
        try {
            name.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("It is an Exception");
        }
    }
}