package ArrayListPractice;

import java.util.ArrayList;

public class ManipulateString {

    /* TASK
   Create One class called ManipulateString
           Create instance a filled called mainString
           Craate constructor with no argument
           create constructor with one argument and initialize the main String
           Method 1:
   Create method called sumNumber()
   take no parameter and it will get the sum of number found in String
if there no number present in String it will return 0
   Method 2:
   Create method called getLetterList()
   Take no paramter and it will return the list of character present in String
   Store letters to the arraylist and return the arraylist(Note do not store the numbers which present in string)
   Create class called ManipulateStringTest with main method
           Create one object and call the methods.
   */
    String mainString;

    public ManipulateString() {
    }

    public ManipulateString(String mainString) {
        this.mainString = mainString;
    }

    public int sumNumber() {
        int sum = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (Character.isDigit(mainString.charAt(i))) {
                String ch = String.valueOf(mainString.codePointAt(i));
                int num = Integer.parseInt(ch);
                sum += num;
            }
        }
        return sum;
    }

    public ArrayList<Character> getLetterList() {
        ArrayList<Character> letterList = new ArrayList<>();
        for (int i = 0; i < mainString.length(); i++) {
            if (Character.isAlphabetic(mainString.charAt(i))) {
                letterList.add(mainString.charAt(i));
            }
        }
        return letterList;
    }

}

