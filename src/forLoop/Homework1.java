package forLoop;

public class Homework1 {

    public static void main(String[] args) {

        int result=0;

        for (int i = 100; i <= 200; i++) {

            if (i % 11 == 0)
                System.out.println(i + ",");
            result += i;

        }
        System.out.println("expected result is " +result );

        }
}




