package Methods;
import java.util.Scanner;
public class TechtorialClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        arrayMethods arrayM = new arrayMethods();

        for (int i = 0; i < arrayM.students.length; i++) {
            System.out.println("What is your name");
            arrayM.studentName = input.next();
            arrayM.addStudent();

            System.out.println("-------------");
            arrayM.printNames();


        }
    }
}