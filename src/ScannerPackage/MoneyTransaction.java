package ScannerPackage;
import java.util.Scanner;
public class MoneyTransaction {

    public static void main(String[] args) {


    // insert three times the money amounts of 500, 1000, 1500
    // I bought a phone and I spent 750
    // I bought used computer and i spent 300
    // Calculate how much money do I have in my saving account?

        Scanner input=new Scanner(System.in);
        System.out.println("Please provide the first amount");

        double first=input.nextDouble();

        System.out.println("Please provide the second amount");
        double second=input.nextDouble();

        System.out.println("Please provide the third amount");
        double third=input.nextDouble();

        double totalSaving= first + second + third;

        System.out.println("Total saving is"+ totalSaving);

        System.out.println("Please enter price for Phone");
        double phonePrice=input.nextDouble();

        System.out.println("Please enter Computer Price");
        double computerPrice=input.nextDouble();
        double totalSpending=phonePrice+computerPrice;

        System.out.println("Total spending is "+totalSpending);
        double leftAmount=totalSaving-totalSpending;

        System.out.println("The amount left after spending is "+leftAmount);








    }
}
