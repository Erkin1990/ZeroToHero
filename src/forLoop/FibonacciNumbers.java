package forLoop;

import org.w3c.dom.ls.LSOutput;

public class FibonacciNumbers {
    public static void main(String[] args) {


    // sum of the first two numbers are equals to next numbers
    // 0, 1
    // 1 - 100

    int num1 = 0, num2 = 1, sum;
        System.out.println(num1+" "+num2);

    for(int i = 1; i<5;i++){

        sum=num1+num2; // 1
        num1=num2;
        num2=sum;
        System.out.print(" "+sum);
    }




}
}