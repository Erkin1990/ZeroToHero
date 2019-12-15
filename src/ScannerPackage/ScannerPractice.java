package ScannerPackage;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("How old are you?");

        int age=input.nextInt();

        System.out.println("I am 20 years old");

        int birthYear=2019-age;

        System.out.println("The birth Year is "+birthYear);

    }
}
