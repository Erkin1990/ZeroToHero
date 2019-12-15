package JavaInterviewTasks;

import java.util.Arrays;

public class FizzBuzz {

    // [2,4,7,9,15,25] --> [2,4,7, Fiz,FizBuz, Buz]
    // if multiple of 3 --> "Fizz" -3,9,12,18
    // if multiple of 5 --> "Buzz" -5,15,20,25
    // if both --> FizzBuzz --> 15,30,45,60

    public static void main(String[] args) {
        // int[] arr=new int[]{2,3,5,10,15,21,30});
        System.out.println(Arrays.toString(fizzBuzz(new int[]{2, 3, 5, 10, 15, 21, 30})));
    }

    public static String[] fizzBuzz(int[] arr) {
        //1. new array
        String[] newArr = new String[arr.length];
        //2. for loop, check each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                newArr[i] = "FizzBuzz";
            } else if (arr[i] % 3 == 0) {
                newArr[i] = "Fizz";
            } else if (arr[i] % 5 == 0) {
                newArr[i] = "Buzz";
            } else {
                newArr[i] = "" + arr[i];
            }
        }
        return newArr;
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) return 0;
        int maximum = arr[0];

        for (int i : arr) {
            if (i > maximum) maximum = i;
        }
            return maximum;
    }
    public static int secondMax(int[] arr){
            return 0;
    }
}
