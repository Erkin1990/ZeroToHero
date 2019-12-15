package IfStatement;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Taks<carSpeed> {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the speed of the car");

        int carSpeed = input.nextInt();
        if (carSpeed >= 0 && carSpeed <= 20) {
            System.out.println("Car gear is 1");
        }else if (carSpeed >= 20 && carSpeed <= 40) {
                System.out.println("Car gear i 2");
            } else if (carSpeed >= 40 && carSpeed <= 60) {
            System.out.println("Car gear is 3");
        } else if (carSpeed >= 60 && carSpeed <= 80) {
        System.out.println("Car gear is 4");
        } else if (carSpeed>=80 && carSpeed <=100){
                System.out.println("Car gear is 5");
            }else{
                System.out.println("car ger is not defined");



            }
        }
        }


