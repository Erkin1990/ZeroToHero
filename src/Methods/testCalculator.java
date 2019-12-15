package Methods;

public class testCalculator {

    public static void main(String[] args) {

        /*
        Creating and object
        calcul --> class name
        c --> object name
        new calcul()--> creating an object
         */

        Calcul c=new Calcul();
        System.out.println(c.sum(5,11));
        System.out.println(c.subtract(12,5));
        System.out.println(c.multiply(2,2));
        System.out.println(c.division(10,5));
        System.out.println(c.remainder(10,4));
        System.out.println(c.remainder(10,2));

        System.out.println(c.calculator(10,5,"!"));
    }
}
