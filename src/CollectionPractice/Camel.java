package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class CamelList {

    public static void main(String[] args) {

        // using HashMAp create one Camel list
        // every camel has differnet animalId as a Strign "1P32M", "2PMA4"
        // Store 5 different camel with their name
        // create one method it will take one parameter as a map
        //it will print only Camel names, if the id is starting with 1


        HashMap<String, String> camelList = new HashMap<>();
        camelList.put("1P32M", "camel1");
        camelList.put("2P32M", "camel2");
        camelList.put("3P32M", "camel3");
        camelList.put("4P32M", "camel4");
        camelList.put("5P32M", "camel5");


        System.out.println(camelList.entrySet()); // entrySet method will return all the keys and values

        // camelList.clear(); --> Clear method will remove every element from the Map

        System.out.println(camelList);
        System.out.println(camelList.containsValue("Camel4"));
        // it will return true of the value is available in the map

        System.out.println(camelList.containsKey("1P32P")); // this key is available, the method returns true
        System.out.println(camelList.containsKey("1P92P")); // this key is not available, the method returns false

        HashMap<String, String> camelList1 = new HashMap<>(camelList);

        System.out.println(camelList1);

        System.out.println(camelList.equals(camelList1));

        camelList.replace("2932M", "Camel8");
        System.out.println(camelList);


    }
}






















