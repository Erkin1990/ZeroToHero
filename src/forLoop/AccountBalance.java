package forLoop;
import StringPackage.StringAdvandce;

import java.util.Scanner;
public class AccountBalance {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);

        System.out.println("please enter your balance");

        int balance=input.nextInt();

        while(balance>0){
            System.out.println("please enter your transaction");

            int transaction=input.nextInt();

            if (balance<transaction) {

                System.out.println("You dont have balance");
            }else{
                balance=balance-transaction;

                System.out.println("Your new balance is: "+balance);
            }
        }


    }
}
