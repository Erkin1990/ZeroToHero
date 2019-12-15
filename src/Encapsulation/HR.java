package Encapsulation;

public class HR {

    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setAge(25);
        employee.setEmployeeId("A@$JALALABAD");
        employee.setSSN(145535867);
        employee.setGender('B');
        employee.setSalary(500000);

        System.out.println(employee.getAge());

    }
}
