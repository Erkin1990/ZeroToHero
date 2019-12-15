package forLoop;
import java.util.Scanner;
public class FindLargestValue {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the total number");

        int totalNumber=input.nextInt(); //6

        System.out.println("Please enter number"+totalNumber+"times");

        int firstNumber=input.nextInt();

        for(int i=0;i<totalNumber-1;i++){
            // this loop needs to run 5 times

            int secondNumber=input.nextInt();

            if(secondNumber<firstNumber){

                firstNumber=secondNumber;
            }
        }
        System.out.println(firstNumber);

    }






}
