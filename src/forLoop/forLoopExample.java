package forLoop;
import java.util.Scanner;
public class forLoopExample {

    public static void main(String[] args) {
        // It is important
        for (int i = 0; i < 10; i++) {

            System.out.println(i);
        }

        for (int i = 9; i >= 0; i--) {

            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        int number;

        for (int i = 1; i <= 28; i++) {
            if (28 % i == 0) {

                System.out.println(i);


            }


        }


    }
}
