package IfStatement;
import java.util.Scanner ;
public class RepeatAndPractice {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("please enter how much earn on monday");
        int earnMonday=input.nextInt();

        System.out.println("Please enter how much earn on tuesday");
        int earnTuesday=input.nextInt();

        System.out.println("Please enter how much earn on wednesday");
        int earnWednesday=input.nextInt();

        System.out.println("Please enter how much earn on Thursday");
        int earnThursday=input.nextInt();

        System.out.println("Please enter how much earn on Friday");

        int earnFriday=input.nextInt();

        double baseSalary=400;
        double weeklySale=earnMonday+earnTuesday+earnWednesday+earnThursday+earnFriday;


        System.out.println("total weekly payment "+weeklySale);
        double weeklyPayment;

        if (weeklySale>800 && weeklySale<1000){
            weeklyPayment = baseSalary + weeklySale * 0.05;
            System.out.println("Commission is 5% "+weeklyPayment);
        } else if (weeklySale>=1000 && weeklySale<1200){
            weeklyPayment = baseSalary + weeklySale * 0.07;
            System.out.println("Commission is 7% "+weeklyPayment);
        } else if (weeklySale>=1200 && weeklySale<1400){
            weeklyPayment = baseSalary + weeklySale * 0.09;
            System.out.println("Commission is 9% "+weeklyPayment);
        } else{
            System.out.println("salary is not determine");

        }
    }
}











