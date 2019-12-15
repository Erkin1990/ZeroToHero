package InheritanceOOP3;

import java.util.function.DoubleUnaryOperator;

public class OverloadingMethods {

    public static Number getNumber(Number num){
        System.out.println("I am returning number.");
        return 1;
    }
    protected static Integer getNumber(Integer num){
        System.out.println("My parameter is Integer");
        return 2;
    }
    static Double getNumber(Double num){
        System.out.println("My parameter is Double");
        return 3.1;
    }

    public static void main(String[] args) {
        getNumber(3);
        getNumber(3.12f);
    }
}
