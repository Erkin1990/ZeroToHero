package CollectionPractice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        // Since set is an interface, you cannot instantiate the set.
        // HashSet, LinkedHashSet, TreeSet
        Set<Integer> numbers = new HashSet<Integer>();

        numbers.add(1);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);

        // HashSet is not allowing to store duplicate elements
        // add method --> first checking the element is store to the et or not
        // if the value is not stored before it will store the value
        // if the value is already present in the set it will not store

        Set<Integer> values = new HashSet<>();
        values.addAll(numbers);

        System.out.println(values);

        Iterator<Integer> iterate = values.iterator();

        while (iterate.hasNext()) {
            if (iterate.next() == 20) {
                System.out.println(iterate.next());
            }
            for(Integer num: values){
                if (num == 20) {
                    System.out.println("This is from foreach loop"+num);
                }

                }
            System.out.println(values.contains(40));
            System.out.println(values.contains(55));

            values.clear();

            System.out.println("this is after clear method");
            System.out.println(values);

            System.out.println(values.isEmpty());

            System.out.println(numbers);

            numbers.remove(40);

            System.out.println("this is after remove method"+numbers);
            }

        }
    }
