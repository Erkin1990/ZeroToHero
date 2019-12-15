package forLoop;
import java.util.Scanner;
public class Practice1 {


    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        for (int i=0; i<5; i++) {

            for(int j=i; j<5; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
