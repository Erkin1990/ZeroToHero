package WhileLoop;

public class ReverseString {

    public static void main(String[] args) {

        String name = "civic";
        String reverse = "";

        //loop
        //after for loop print the reverse="civic";

        for (int i = name.length() - 1; i >= 0; i--) {

            reverse+=name.charAt(i);


        }  System.out.println(reverse);
        if (reverse.equalsIgnoreCase(name)){

            System.out.println(reverse+ " is palindrome");

        }else {
            System.out.println(reverse+ "is not palindrome");
        }

    }
}