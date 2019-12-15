package StringPackage;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String schoolName="Techtorial Academy 2019 September";

        String [] words=schoolName.split("A");

        System.out.println(Arrays.toString(words));
        // first side is name of string
        // second side is name of your array
        for(String word: words){

            if(word.startsWith("A")){
                System.out.println(word);
            }
        }


        String date="09/16/2019";

        String [] dates=date.split("/");

        System.out.println(dates[0]);
        System.out.println(dates[1]);
        System.out.println(dates[2]);

        String startDate="09.16.2019";

        String [] startDates=startDate.split("\\.");

        System.out.println(Arrays.toString(startDates));
        System.out.println(startDates[0]);

        //REPLACing numbers

        System.out.println(startDate.replace("1", "9"));

    }
}
