package PolymorphismOOP;

public class Child extends Super {

    @Override
    public void myMethod(){
        System.out.println("I am inside of Child class");
    }

    public static void staticMethod(){
        System.out.println("I am static method from Child class");
    }
    public void childMethod(){
        System.out.println("I am child method from Child Class");
    }
}
