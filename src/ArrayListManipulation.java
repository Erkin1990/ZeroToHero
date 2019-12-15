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
        // add values
        
    }
}
