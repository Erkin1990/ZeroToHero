package forLoop;
import java.util.Scanner;
public class PrintTheLetter {

    public static void main(String[] args) {

        Scanner input=new  Scanner (System.in);

        String name="Techtorial Academy";
        // index will return the number
        // charAt will return the char
        // index number is 17
        // what is the length 18

        System.out.println(name.charAt(10));
        // iw will give the stringIndexOutOfBoundException
        // runtime error

        System.out.println(name.indexOf('k'));
        // Answer is " -1 "
        System.out.println(name.replace('k', 'a'));
        // Since there is no 'k' inside my String, it will remain the same
        System.out.println(name.length()-1 );

        for(int i=0;i<name.length()-1;i++){
            System.out.println(name.charAt(i)+",");
        }

    }




}
