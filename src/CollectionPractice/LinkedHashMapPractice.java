package CollectionPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {

        // Synchronization
        // It will follow insertion order.
        Map<Integer, String> studentList=new LinkedHashMap<>();

        studentList.put(1,"Muammer");
        studentList.put(2, "David");
        studentList.put(3,"John");

        System.out.println(studentList);
    }
}
