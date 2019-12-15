package CollectionsRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManipulation {

    public static void main(String[] args) {

        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();
        List<String > st1=new ArrayList<>();
        // creating ArrayList with size

        ArrayList<Integer> ar3=new ArrayList<>(10);
        ar3.add(100);
        ArrayList<Integer> ar4=new ArrayList<>(ar3);
        // adding Array to ArrayList
        Integer[] num={3,5,7,9};
        List<Integer> ar5= Arrays.asList(num);
        for(Integer a: num){
            ar5.add(a);
        }
        ar5.addAll(ar3);
        System.out.println(ar5.size()+"size");
        System.out.println(ar5);

        List<String> cities1=Arrays.asList(new String[]{"Moscow","Chi"});
        System.out.println(cities1);
        List<String> cities2 = new ArrayList<>(cities1);
        // add values
        cities2.add("Istanbul");
        cities2.add(1,"London");
        System.out.println(cities2);
        cities2.addAll(3,cities1);
        System.out.println(cities2);
        // remove
        cities2.remove("London");
        System.out.println(cities2);
        cities2.remove(6);
        System.out.println(cities2);
        cities2.removeAll(cities1);
        System.out.println(cities2);
        cities2.clear();
        System.out.println(cities2+"after clear");
        // check if list is empty
        System.out.println(cities2.isEmpty());
        System.out.println(cities2.size()==0);
        // IndexOf
        System.out.println(cities2.indexOf("London"));// first index of London
        System.out.println(cities2.lastIndexOf("London")); // last index of London
        // set element
        cities2.set(1, "Miami");
        // remove
        cities2.remove("London");
    }
}
