package StringPackage;

public class StringAdvandce {

    public static void main(String[] args) {

        String name="Muammer";
        // re-assigning the name


        name="Arslan";

        String computerName="MacPro";
        System.out.println(computerName+" 2019");

        String schoolNAme="Techtorial";

        //length () will return number of the char in String.
        // result will be int

        System.out.println("String length is "+schoolNAme.length());

        String fullName=schoolNAme+"Academy";

        System.out.println("Full name length is "+fullName.length());

        String userName="Techtorial2400";

        int userNameLength=userName.length();


        System.out.println((userNameLength));

        System.out.println(userName.charAt(0)); //t
        System.out.println(userName.charAt(3)); //h
        System.out.println(userName.charAt(7)); //i
        //if u wanna find out last char from the String
        //we need first find out the length of the String

        System.out.println(userName.charAt(15));

        //If in index there is not char, Java wll throw an exception
        // StringIndexOutOfBoundException

        String success="hustling";

        System.out.println(success.indexOf("s"));
        System.out.println(success.indexOf("in"));




    }

}
