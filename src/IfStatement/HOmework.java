package IfStatement;
import java.util.Scanner;
public class HOmework {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the clothes color");
        String clothColor=input.nextLine();
        if (clothColor.equalsIgnoreCase("red")){
            System.out.println("The child's School is Kindergarden");
        } else if (clothColor.equalsIgnoreCase("blue")){
            System.out.println("The child's school is Elementary");
        } else if (clothColor.equalsIgnoreCase("white shirt and gray pants")){
            System.out.println("The child's school is Middle ");
        } else if (clothColor.equalsIgnoreCase("blue shirt with blue pants")){
            System.out.println("The child's school is High ");
        } else {
            System.out.println("the child did not attend to school");
        }
    }
}




