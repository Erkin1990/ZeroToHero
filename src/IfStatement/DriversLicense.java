package IfStatement;
import java.util.Scanner;
public class DriversLicense {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the age");

        String age = input.next();

        System.out.println("Please provide exam score");

        int examScore = input.nextInt();

        System.out.println("Do u have state ID?");

        String stateId = input.next();

        boolean inCondition;
        if (stateId.equalsIgnoreCase("yes")) {
            inCondition = true;
        } else {
            inCondition = false;

            System.out.println("Did u pass the driverslicense practice");

            String driPractice = input.next();

        }
    }
}

