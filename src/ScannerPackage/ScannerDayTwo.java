package ScannerPackage;
import java.util.Scanner;
public class ScannerDayTwo {

    public static void main(String[] args) {

        //Provide two number and find remainder of this two number and print

        Scanner input=new Scanner(System.in);
        /*
        System.out.println(("Please provide the number"));

        int number1=input.nextInt();
        int number2=input.nextInt();
        int remainder=number1%number2;

        System.out.println("Remainder of the number is "+remainder);*/

        //String name=input.Next();
        //Next and nextLine();
        //String fullName="Erkin  Toktobekov";

        System.out.println("Please provide two full names");

        String name1=input.nextLine();
        String name2=input.nextLine();

        System.out.println("List of the Names  "+name1+ "and "+name2);



    }
}
