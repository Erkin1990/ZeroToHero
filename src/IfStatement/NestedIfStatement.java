package IfStatement;
import java.util.Scanner;
public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do u have a passport?");

        boolean passport = input.nextBoolean();

        if (passport) {

            System.out.println("Do u have a ticket");

            boolean ticket = input.nextBoolean();

            if (ticket) {

                System.out.println("you can come to US");


            }

        }
    }
}
























