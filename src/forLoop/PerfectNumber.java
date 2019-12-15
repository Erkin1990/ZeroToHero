package forLoop;
import java.util.Scanner;
public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number=input.nextInt();
        int sum=0;
        for (int i=1;i<number;i++) {

            if (number%i==0) {
            sum=sum+i;

            }
            if(sum==number) {
                System.out.println(number+" is perfect number");

            }else {

                System.out.println(number+" is not perfect number");
            }

            // Positive testing
            // Once you enter the perfect number result should is perfect number
            // Negative Testing
            // Once you enter not perfect number you should see that its not perfect number
            // Scenario
            // give the String and it should not work
        }







    }








}
