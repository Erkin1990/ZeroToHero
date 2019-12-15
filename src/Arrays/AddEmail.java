package Arrays;

import java.util.Arrays;

public class AddEmail {

    public static void main(String[] args) {

        String names[] = {"Lisa", "Kubat", "Yalcin", "Erkin","Sema","Kira"};

        // Write a program that will convert this names to emails and will save to array
        // Example: lisa@gmail.com

        String[] emails=new String[names.length];
        for(int i=0; i<names.length; i++){
            emails[i] = names[i]+"@gmail.com";

        }
        System.out.println(Arrays.toString(emails));


    }
}
