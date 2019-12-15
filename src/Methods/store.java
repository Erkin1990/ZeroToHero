package Methods;
import java.util.Scanner;
public class store {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the quantity?");

        int quantity = input.nextInt();
        System.out.println("Please enter the price?");

        int price = input.nextInt();

        ProfitCalculator pc = new ProfitCalculator();

        if(quantity<20){
            System.out.println(pc.sell(price,quantity));
            System.out.println("There is no discount if u buy 20 or more");
        }else if(quantity>=20 && quantity<40){
            System.out.println(pc.sell10dis(price,quantity));
            System.out.println("Your price includes 10% discount");
        }else if(quantity>=40){
            System.out.println(pc.sell20discount(price,quantity));
            System.out.println("Your price includes 20% discount");
        }else{
            System.out.println("Your quantity is INVALID");
        }
        // small 2
        // medium 4
        // large 5




    }
}
