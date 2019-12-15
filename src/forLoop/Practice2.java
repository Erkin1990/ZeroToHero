package forLoop;
import java.util.Scanner;
public class Practice2 {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println("enter the number");

        int number=input.nextInt();

        for (int i=1; i<=10; i++){

            System.out.println(number+"*"+i +"="+number*i);

        }
    }
}
