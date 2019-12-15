package ArrayListPractice;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysListMethod {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        // once i create the names,i am saying only i can store the String
        //other then String i connot store
        names.add("Adam");
        System.out.println(names);
        names.add("John");
        names.add("Steve");
        System.out.println(names);
        names.add(1, "David");
        System.out.println(names);

//        names.add(10,"David");
//        System.out.println(names);
        // if u try to add the value to your arrayList but your arrayList size is less than index number
        // it will throw IndexOutOfBoundsException
        //  names.add(Boolean.true);
        // names.add("true");
        // names.add(true) wrong

        List items = new ArrayList();
        items.add("banana");
        items.add(1, "Orange");
        System.out.println(items);
        System.out.println(items.get(1));
        System.out.println(items);
        System.out.println(items.get(0));
        System.out.println(names);
        names.remove("John");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
        names.remove("Trump");
        ArrayList<Integer> prices=new ArrayList<>();
        prices.add(1);
        prices.add(2);
        prices.add(3); //int values is automatically converted to the int object
        prices.remove(1);
        System.out.println(prices);

        prices.set(1,5);
        System.out.println(prices);
        System.out.println(prices.isEmpty());

        System.out.println(prices.size());


    }
}






