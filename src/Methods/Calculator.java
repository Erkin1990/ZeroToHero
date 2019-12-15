package Methods;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Java");
        myMethod ("Techtorial");

    }

    // public --> access modified
    // void   --> return type
    // myMethod --> method name
    // String name -> parameter
    // myMethod(String name) --> signature
    // static --> static and no static

    public static void myMethod(String name){
        System.out.println("My name is "+name);

    }
}
