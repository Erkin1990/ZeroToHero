package StaticPractice;

import jdk.swing.interop.SwingInterOpUtils;

public class StaticReview {

    // Static instance variables
    // Static method
        // to be able to call the static method, i don't need to create an object
    // Static block
        // it will run before everything in class
        // to initialize the instance variables
        // it belongs to class
        // instance initialization block
        // instance block belongs to an object
        // it will run before every object


    static String name;
    {
        System.out.println("this is instance block");
    }
    static {
        System.out.println("this is static block");
    }
    public static void test()
    {
        //static int number = 10;
        System.out.println(name);
        System.out.println("this is static method");
    }
    public void test1(){
        System.out.println(name);
    }
    public static int add(int a, int b){
        int k=a+b;
        return k;
    }
    public static int substract(int a, int b){
        int c=a-b;
        return c;
    }
    public static int divide(int a, int b){
        int d=a/b;
        return d;
    }
    public static int muliply(int a, int b){
        int e=a*b;
        return e;
    }
}







