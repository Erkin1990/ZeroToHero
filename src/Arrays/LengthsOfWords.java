package Arrays;

public class LengthsOfWords {

    public static void main(String[] args) {

        String[] names={"Eric", "John", "Patel", "Harsh", "Sarah", "Lilly", "Nina"};
        // print out names which has names lengths of 4



        for (int b = 0; b <names.length; b++) {
            if(names[b].length()== 4){
                System.out.println(names[b]);
            }
        }


    }
}