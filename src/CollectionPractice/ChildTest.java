package CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Set;

public class ChildTest {

    public static void main(String[] args) {

        Child child1=new Child("Civic",10,"Chicago",'M');
        Child child2=new Child("Mom",5,"Los Angeles", 'F');
        Child child3=new Child("David",6,"Iowa",'M');
        Child child4=new Child("Jennifer",3,"Chicago",'F');
        Child child5=new Child("John",1,"Kansas", 'M');

        LinkedHashMap<Integer, Child> childMap=new LinkedHashMap<>();

        childMap.put(1,child1);
        childMap.put(2,child2);
        childMap.put(3,child3);
        childMap.put(4,child4);
        childMap.put(5,child5);

        Set<Integer> keyList=childMap.keySet();

        for(Integer c:keyList){

            childMap.get(c);
          //  System.out.println(childMap.get(c).);
            System.out.println(childMap.get(c).goToSchool());
         //   System.out.println(childMap.get(c).isPalindrome(childMap.get(c).getName()));





        }

    }
}
