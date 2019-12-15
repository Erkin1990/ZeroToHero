package Methods;
import java.util.Scanner;
public class invest {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        Investment investment=new Investment();

        System.out.println("Please enter an amount: ");
        investment.amount = input.nextDouble();

        System.out.println("Please enter number of years you want to invest");
        investment.years = input.nextDouble();

        System.out.println("Please enter the rate");
        investment.rate = input.nextDouble();

        System.out.println("Your total will be "+investment.totalAmount()+"in"+investment.years+" years!");



    }
}
