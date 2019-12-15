package StringPackage;

import java.util.Scanner;

public class StringContains {

    public static void main(String[] args) {

        String name="236 - Muammer";

        boolean condition=name.startsWith("235");

        System.out.println(name.startsWith("mer"));

        boolean condition2=name.endsWith("mer");

        System.out.println(condition2);

        boolean condition3=name.contains("-");

        System.out.println(condition3);

        //Using scanner input your name and check your name cointains giving value
        // F - your name
        // M - your name
        // check start with F if you are female
        // check start with M if u are male
        // check input contains your name or not

        Scanner input=new Scanner(System.in);

        String sName=input.nextLine();

        boolean gender=sName.startsWith("M");

        boolean checkName=sName.contains("Muammer");

        boolean date=sName.endsWith("1990");

        System.out.println("The value is starting with M "+gender);
        System.out.println("The value contains Muammer"+checkName);
        System.out.println("The value is ending with 1991"+date);

        // first correct values true, true, true
        // all the values are wrong
        // gender is correct name and date are wrong
        // gender is correct name is wrong and date is correct




    }






}
