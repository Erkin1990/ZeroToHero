package ConstructorPractice;

import jdk.swing.interop.SwingInterOpUtils;

public class NumberPractice {

    public int multiply(int num){
        return num*10;
    }
    public double remainder(int value){
        return value%4;
    }
    public double bonus (int Salary){
        double  bonusAmount=Salary*0.10;
        return bonusAmount;
    }
    public void slice (int bananaNumber){
        System.out.println(bananaNumber+" has 10 silces");
    }
    public static void main(String[] args) {
        int appleNumber=10;

        NumberPractice apple=new NumberPractice();

        System.out.println(apple.multiply(appleNumber)); // result is 100
        System.out.println(appleNumber); // since method took the copy of the AppleNumber.
        // Apple number value is not changing.

        appleNumber=apple.multiply(5);

        System.out.println(appleNumber); //100

        System.out.println(apple.remainder(appleNumber)); //100%4 = 0

        System.out.println(appleNumber); // 100

        int baseSalary=100000;

        NumberPractice salaryCalculator=new NumberPractice();

        appleNumber=salaryCalculator.multiply(5);

        double bonus=salaryCalculator.bonus(baseSalary);

        System.out.println(bonus);
        System.out.println(baseSalary);

        double totalSalary=baseSalary+bonus;

        System.out.println(totalSalary);

        int bananaNumber=3;

        NumberPractice banana=new NumberPractice();
        banana.slice (bananaNumber);
        System.out.println(bananaNumber);



        System.out.println(bananaNumber);
    }
}
