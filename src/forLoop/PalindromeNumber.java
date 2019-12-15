package forLoop;

public class PalindromeNumber {

    public boolean isPalidrome(int original){

        int temp=original;
        int reversed=0;
        while(temp>0){

            int remainderOriginal=temp%10;
            reversed=reversed*10+remainderOriginal;

            temp=temp/10;
        }
        if(reversed==original){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

        PalindromeNumber palindrome=new PalindromeNumber();

        boolean result=palindrome.isPalidrome(455554);

        System.out.println(result);


    }
}
