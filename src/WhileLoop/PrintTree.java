package WhileLoop;

public class PrintTree {

    public static void main(String[] args) {

        int number=4;
        String star="*";


        do{
            System.out.println(star); int number1=1;

            do{
                System.out.println(number1);

              number1++;

            }while (number1>=number);

            star=star+"*";
            number--;
        }while (number>=0);






    }



















}
