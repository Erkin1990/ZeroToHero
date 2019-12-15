package IfStatement;

import ScannerPackage.ScannerDayTwo;

import java.util.Scanner;

public class PracticeONe {

    public static void main(String[] args) {

        int averageScore=85;
        // 80 - 89= letter grade = B

        if(averageScore>=80 &&averageScore<90){

            System.out.println("Letter grade is B");
            averageScore++;
            System.out.println("Student pass the test");
        }

        System.out.println(averageScore);

        Scanner input=new Scanner (System.in);

        System.out.println("Please provide drivers age?");

        int driverAge = input.nextInt();



















    }
}
