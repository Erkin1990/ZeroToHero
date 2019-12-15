package CollectionPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {

        Map mapList=new HashMap();
        // Map <key, values> employeeList
        Map <Integer, String> employeeList=new HashMap<>();

        employeeList.put(1234, "Muammer");
        employeeList.put(1235, "David");
        employeeList.put(1236, "Kushal");
        employeeList.put(1237, "Priyanka");
        employeeList.put(1237, "Priyanka");

                // i can store same values.
                // but Key should be unique.
                // If you provide the same key with different value
                // it will update the value for the key

        HashMap<Integer, String> ticketMasterEmp=new HashMap<>();
        ticketMasterEmp.putAll(employeeList);

        // Get method. It will get the key as a parameter and will return the value
        String empName=ticketMasterEmp.get(1234);

        System.out.println(empName);
        System.out.println(ticketMasterEmp);

        // Method called keySet(), it will return Set of all the keys from map

        Set<Integer> empId=ticketMasterEmp.keySet();

        for(Integer id: empId){
            System.out.println("Name if the employee is"+ticketMasterEmp.get(id));
        }
        for(Integer id: empId){
            System.out.println("ID of the employee is"+id);
        }

    }
}
