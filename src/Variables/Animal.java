package Variables;

public class Animal {

    /*In Farm we have 23 cows and 42 chickens
    Calculate the total number of legs in this
     */
        // price is 2000$
        // One ch

   public static void main(String [] args) {
    int cow=23;
    int chicken=42;
    int totalCowLegs=cow*4;
    System.out.println("Total amount of cows legs in the farm is "+totalCowLegs);
    int totalChickenLegs=chicken*2;
    System.out.println("Total amount of chicken legs in the farm is "+totalChickenLegs);
    int totalAnimalLegs=totalCowLegs+totalChickenLegs;
    System.out.println("Total amount of of legs in the farm is"+totalAnimalLegs);

    int cowPrice=cow*2000;
    int chickenPrice=20;

   }

}
