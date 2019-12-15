package StaticPractice;

public class Cat {

    static int meowMix=10;
    int kitKab=8;

    // create one method will take int number
    // this method is called eatMix
    // once i call the method it will reduce to number of meowMix
    // meowMix, return type is boolean

    // create one method, it will take one int number as parameter
    // this method is called eatKit
    // once I call the method ot will reduce number of KitKab
    // return type is boolean

    public static boolean eatMix(int amount){
        eatMix(4);
        if(amount<=meowMix){
            meowMix-=amount;
            System.out.println("The meoMix amount is "+meowMix);
            return true;
        }
        return false;
    }
    public boolean eatKit (int amount){
        if(amount<=kitKab){
            kitKab=amount;
            System.out.println();
            return true;
        }
        return false;
    }
}
