package Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        String[] numbers = {"1,2,3,5,11,9,0"};



        for (int b = 0; b>=numbers.length; b++) {
            if (numbers[b].length() == 7) {
                System.out.println(numbers[b]);
            }
        }
    }}