package Arrays;
import java.util.Scanner;
public class FindElement {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String[] colors ={"red", "green", "black", "white", "orange"};
            //Write a program that will ask a user input a color
            // If your color is inside of the array Then it will return "inside of array"
            // If your color is not in array its should return -1

        System.out.println("Please enter the color");

        String color=input.next();

        int count=0;
        for(String m: colors){
            if(color.equalsIgnoreCase(m)){
                System.out.println("Your color is inside of array");
            }
            count++;
            if(count==colors.length){
                System.out.println("-1");
            }

        }






    }
}
