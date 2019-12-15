package IfStatement;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter average score");
        int GradeA = input.nextInt();

        if (GradeA >= 80 && GradeA <= 100) {
            System.out.println("Average score is A");
        } else if (GradeA >= 60 && GradeA <= 80) {
            System.out.println("Average score is B");
        } else if (GradeA >= 40 && GradeA <= 60) {
            System.out.println("Average score is C");
        } else if (GradeA >= 20 && GradeA <= 40) {
            System.out.println("Average score is D");
        } else if (GradeA >= 0 && GradeA <= 20) {
            System.out.println("Average score is F");
        } else {
            System.out.println("Score is not defined");


        }
    }
}