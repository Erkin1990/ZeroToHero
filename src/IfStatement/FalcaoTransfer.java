package IfStatement;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class FalcaoTransfer {

    public static void main(String[] args) {

        // first Galatasaray should pay 3mil to the club
        // Gal should pay 5 mil to Falcao

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the Galatasaray Budget");

        int galataBudget = input.nextInt();

        System.out.println("Please enter Player Salary");

        int playerSalary = input.nextInt();

        if (galataBudget == 30000000 && playerSalary == 50000000) ;

        System.out.println("Falcao can come to Galatasaray");

        // Microphone from amazon ( TONOR Dynamic Karaoke )
        // using scanner you need input the star, review number, price mic
        // 4 star, more than 100 review, price should be less than 20
        // if your cindition is true print I can buy the TONOR mic
        // else print I cannot buy the TONOR

        System.out.println("Please enter produc star rating");
        int starRate = input.nextInt();

        System.out.println("Please enter product review number");
        int review = input.nextInt();

        System.out.println("Please enter product price");
        int price = input.nextInt();

        if (starRate >= 4 && review > 100 && price <= 20) {

            System.out.println("I can buy the product");
        } else {

            System.out.println("I cannot buy the product");

        }
    }
}








