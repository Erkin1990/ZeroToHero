package CollectionPractice;

import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {

        // it does not allow to store the null key but you can store null
        // it follows ascending order
        // it will look at the key and according values of key it will do ascending order

        TreeMap<String,String>phoneList=new TreeMap<>();

        phoneList.put("Muammer","12639732");
        phoneList.put("David","76599654");
        phoneList.put("Sameer","1235977");
        phoneList.put("James","null");

        System.out.println(phoneList);
    }
}
