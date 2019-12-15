package Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 100;
        numbers[3] = 15;
        numbers[4] = 20;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers.length);
        System.out.println("***********");

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }
}
