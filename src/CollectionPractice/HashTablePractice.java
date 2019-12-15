package CollectionPractice;

import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {

        Hashtable<Integer,Boolean> truthList=new Hashtable<>();

        truthList.put(123,true);
        truthList.put(345,false);
        truthList.put(678,true);
        truthList.put(125,false);
            System.out.println(truthList);

    }
}
