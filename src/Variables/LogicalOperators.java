package Variables;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean hasVisa=true;
        boolean hasTicket=false;

        boolean canCome=hasVisa&&hasTicket;

        System.out.println("Can i come to the USA? "+canCome);

        boolean finishedESL=false;
        int toeflScore=80;

        boolean canGoToCOllege=finishedESL || toeflScore>=79;


        System.out.println("Can go to the college? "+canGoToCOllege);

        // To be able to buy a house I should have enough money or..
        // I should have a mortgage
        // current money 200.000
        // home price 300.000

        int currentMoney=200_000;
        int homePrice=300_000;

        boolean hasMortgage=false;
        boolean hasEnoughMoney=currentMoney>=homePrice; // false
        boolean canBuyHome=hasMortgage || hasEnoughMoney;

        System.out.println("can i buy a house?" +canBuyHome);

        // I should have driers licence
        // age 16
        // should pass the exam
        // my score is 70
        // expected 75
        // I should have visa

        int myAge=20;
        int expectedAge=16;

        boolean ageRequirement=myAge>=expectedAge; //true

        int myScore=80;
        int expectedScore=75;

        boolean passExam=myScore>=expectedScore;
        boolean hasVisa1=true;
            // age
            // score
            // visa

        boolean canGetLicence=ageRequirement && passExam && hasVisa1;
         System.out.println("can i get the DL?"+canGetLicence);



    }
    }



