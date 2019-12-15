package IfStatement;
import java.util.Scanner;
public class PhonePrice {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //How do you handle the stress?
        //priority to work
        //I can divide my jov to the parts
        //all of them part by part

        //phone price 1000
        //user entered 700
        //please enter the rest Amount

        double phonePrice=1000;
        System.out.println("Please make the payment");
        double paymentAmount=input.nextDouble();

        if(paymentAmount>=phonePrice){

            System.out.println("you can buy the phone");

        }else if(paymentAmount<phonePrice){
            double restAmount=phonePrice-paymentAmount;
            System.out.println("Please enter the rest of the money"+restAmount);
                double restPayment=input.nextDouble();

                if(restPayment>=restAmount){

                    System.out.println("you can buy the product");
                }else {
                    System.out.println("you cannot buy the product");
                }



        }





    }












}
