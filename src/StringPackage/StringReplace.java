package StringPackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReplace {

    public static void main(String[] args) {

        String success="dotentimesmore";

        success=success.replace('d','D');

        System.out.println(success);

        success=success.replace("ten", "eleven");

        System.out.println(success);

        // success.replace('X', 'M');
        // it will search the String to find oldChar or oldString
        // if it is not able to find it will not change the value

        String achievement=" do ten times more";

        achievement=achievement.trim();

        System.out.println(achievement);

        // Using scanner give the following value
        // " Zero To Hero  "
        // print only "Hero"
        // trim the spaces
        // replace "Zero with "one"
        // print all of them upper case
        // check true if it is equal ignore case to "zero to hero"

        Scanner input=new Scanner((System.in));

        System.out.println("Please type Zero to Hero");

        String value=input.nextLine();

        System.out.println(value.substring(11,15));
        System.out.println(value.trim());
        System.out.println(value.replace("Zero", "One"));
        System.out.println(value.toUpperCase());
        System.out.println(value.equalsIgnoreCase("   zero to hero"));














    }










}
