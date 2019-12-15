package Arrays;
import java.util.Arrays;


public class MaxNumber {

    public static void main(String[] args) {

        int [] number={3,6,101,2,56,0,-10};

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));
        System.out.println(number[number.length-1]);
        System.out.println(number[0]);
        System.out.println(number[number.length/2]);
    }
}
