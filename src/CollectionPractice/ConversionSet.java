package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class ConversionSet {

    public static void main(String[] args) {

        ArrayList <String> singerList=new ArrayList<>();

        singerList.add("Drake");
        singerList.add("Jackson");
        singerList.add("Cardi B");
        singerList.add("Beyonce");
        singerList.add("Drake");

        System.out.println("This is arrayList"+singerList);

        HashSet <String> singerList1=new HashSet<String>();

        System.out.println("this is set"+singerList1);

        singerList=new ArrayList<>(singerList1);

        System.out.println("This is after converting"+singerList);
        System.gc();


    }
}
