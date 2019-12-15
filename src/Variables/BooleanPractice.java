package Variables;

public class BooleanPractice {

    public static void main(String [] args){

        boolean isLightOn=true;

        isLightOn=false;
        isLightOn=!true;

        System.out.println(isLightOn);

        int currentSpeed=10;

        int speedLimit=50;

        boolean increaseSpeed=currentSpeed<speedLimit;//true
        boolean decreaseSpeed=currentSpeed>speedLimit;//false

        System.out.println(increaseSpeed);
        System.out.println(decreaseSpeed);

                //average temp for the room is 72F
                // if current temp is less than 72F increase
                // current temp is more 72F decrease

        int currentTemp=60;
        int averageTemp=72;
        boolean increaseTemp=currentTemp<averageTemp;
        boolean decreaseTemp=currentTemp>averageTemp;

        System.out.println("increase temp is "+increaseTemp);
        System.out.println("decrease temp is "+decreaseTemp);

        //sell the alcohol if person age is more than or equals to 21
        //dont sell alcohol if person age is less than 21

        int personAge=18;
        int legalAge=21;

        boolean sellAlcohol=personAge>legalAge; //18>=21; false
        boolean dontSellAlcohol=personAge<legalAge; //18<21; true

        System.out.println("sell the alcohol "+sellAlcohol);
        System.out.println( "+dont sell the alcohol"+ dontSellAlcohol);

        // if you have 500.000 you can buy 5 room single house
        // if you dont have 500.000 you cannot buy the 5 room single house
        // your current saving is 120000

        int n=500_000;

        int housePrice=500_000;
        int moneyHave=120_000;

        boolean ifBuyHouse=housePrice>moneyHave;
        boolean ifDontBuyHouse=housePrice<moneyHave;

        System.out.println ("buy a house if u have enough money " +ifBuyHouse);
        System.out.println (" dont buy a house if u dont have enough money " +ifDontBuyHouse);






    }










}
