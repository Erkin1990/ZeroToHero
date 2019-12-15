package CollectionPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {


        // LinkedHashSet follows the insertion order
        // HashSet does not follow the insertion order
        // In LinkeHashSet everything is same with HashSet except order
        // all the method which Set has, we can use in the LinkedHashSet

        // Set names=new LinkedHashSet():
        // LinkedHashSet<Integer> number=new LinkedHashSet<>();

        TreeSet<String> eventAttendanceList = new TreeSet<>();

        eventAttendanceList.add("Mike");
        eventAttendanceList.add("Jennifer");
        eventAttendanceList.add("John");
        eventAttendanceList.add("David");
        // eventAttendanceList.add(null);

        System.out.println(eventAttendanceList);

        // TreeSet follows the ascending order
        // TreeSet does not accept the null values
        // It will give the null pointer exception

        Iterator<String> i = eventAttendanceList.descendingIterator();
        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println(eventAttendanceList);

        eventAttendanceList.pollLast();
        System.out.println(eventAttendanceList);
    }
}