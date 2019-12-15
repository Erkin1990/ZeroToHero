package IfStatement;
import javax.swing.*;
import java.util.Scanner;

public class LeapYearCalculator {

    public static void main(String[] args) {

        System.out.println("Please enter the year");
        
        //byte 127 - 128
        //short / short = (short) int

        Scanner input=new Scanner (System.in);
        int year=input.nextInt();
        
        if(year%4==0 &&  year%100!=0 || year%400==0){

            System.out.println("it is leap year");
        }else{
            System.out.println("It is not leap year");
            System.out.println("It is not leap year");

            // if its true  /
                        // it is leap year
    }
    }
    
    
}
