package Arrays;

import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {

        String[] letters={"b", "aa", "ab", "w", "q", "c", "p", "A"};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));

        System.out.println(Arrays.binarySearch(letters, "A"));

        // if it starts to count on positive way it will read and count every letter
        // if it wont find the letter on the list, it will start reading in negative way
        // as soon as it starts to read in negative way the will read it piece by piece, not letter by letter




    }
}
