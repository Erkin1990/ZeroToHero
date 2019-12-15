package ScannerPackage;

import java.util.Scanner;

    public class Car {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How much do u have?");

        double currentSaving=input.nextDouble();

        System.out.println(" How much is the car");

        double carPrice=input.nextDouble();
        double difference=carPrice -currentSaving;

        boolean canBuy=currentSaving>=carPrice;

        System.out.println("Difference between current saving and car price is"+difference);

        System.out.println("Can i buy the car?");

        System.out.println("where do u live");

        // for String input.next(); --> if you are entering only the value
        // if you need to enter more than one String you need to use input.nextLine();



        String city=input.nextLine();

        System.out.println("My current city is "+city);

    }
}
