package CollectionPractice;

import java.util.Set;
import static CollectionPractice.City.*;
public class MainCity {

    public static void main(String[] args) {
        Set village1=addVillage ("Mountains",5,"1A567B4",900);
        Set village2=addVillage("KakDela",9,"2B176A3",600);
        printAll();
        System.out.println(findName("Mountains"));
        System.out.println(findId("2B176A3"));
        System.out.println(sum());
    }
}










