package IfStatement;
import java.util.Scanner;
public class BankOfAmerica {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the username");

        String userName = input.next();

        //username
        //password
        //captcha

        if (userName.equals("mTuran")) {

            System.out.println("Please enter the password");

            String password = input.next();

            if (password.equals("DesPlaines21")) {

                System.out.println("Please enter the Captcha");

                String captcha = input.next();
                if (captcha.equals("beam")) {

                    System.out.println("Welcome to Bank of America");

                }
            } else {
                System.out.println("Captcha is wrong");

            }
        } else {

            System.out.println("Username is wrong");

        }
    }
    }

