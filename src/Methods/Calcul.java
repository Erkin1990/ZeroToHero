package Methods;

import Variables.BooleanPractice;

public class Calcul {


        /*
        write a method tat will accept two int parameters
         and will return sum of these two integers as an Int
         */

    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int subtract(int num1, int num2) {
        int subtract = num1 - num2;
        return subtract;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        return num1 / num2;
    }

    public boolean remainder(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;

        } else if (num1 % num2 != 0) {
            return false;
        }
        return false;
    }
    /*
    Write a method that will accept 3 parameters,
    which two are integer numbers and one string operator
    and will return the result for these two number based
    on their operator.
     */

    public int remainderNumber(int num1, int num2){
        return num1%num2;
    }

    public int calculator(int num1, int num2, String operator) {
        if (operator.equals("+")) {
            return sum(num1, num2);

        } else if (operator.equals("-")) {
            return subtract(num1, num2);

        } else if (operator.equals("*")) {
            return multiply(num1, num2);

        } else if (operator.equals("/")) {
            return division(num1, num2);

        }else if (operator.equals("%")){
            return remainderNumber(num1,num2);
        } else {
            System.out.println("your operator is invalid");
            return -1;
        }


    }
}