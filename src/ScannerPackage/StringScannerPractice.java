package ScannerPackage;
import java.util.Scanner;
public class StringScannerPractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please provide two names");

        String name1=input.nextLine();
        String name2=input.nextLine();

        System.out.println("Two names "+name1+" and "+name2);

    }
}
