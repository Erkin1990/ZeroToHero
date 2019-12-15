package IfStatement;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);

        System.out.println("Monday");
        int monday=input.nextInt();
        System.out.println("Tuesday");
        int tuesday=input.nextInt();
        System.out.println("Wednesday");
        int wednesday=input.nextInt();
        System.out.println("Thursday");
        int thursday=input.nextInt();
        System.out.println("Friday");
        int friday=input.nextInt();
        int baseSalary=400;
        int totalPrice=monday+tuesday+wednesday+thursday+friday;
        double bonus=totalPrice*5/100;
        if (totalPrice>=800 ) {
            System.out.println("sales person weekly salary with bonus will be - $ " + bonus + 400);
        }else if(totalPrice<800){
            System.out.println("Sales person weekly salary will be "+totalPrice);
        }








    }








}
