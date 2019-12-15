package ScannerPackage;
import java.util.Scanner;


    public class HomeWork {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Total sales worth input");
            int sales=input.nextInt();
            System.out.println("Commission rate");
            int commission=input.nextInt();
            int totalCommission=sales*commission/100;
            System.out.println("Your total commission payment is "+totalCommission);
        }
    }


