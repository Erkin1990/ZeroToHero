package ArrayListPractice;
import java.util.ArrayList;
import java.util.Scanner;
public class Fruits {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            ArrayList <String> fruitList=new ArrayList();
            // if you won't specify a datatype fr your ArrayList
            // it will store every element as an object.
            System.out.println("Provide fruits?");
            int count=5;
            for(int i=0;i<5;i++){fruitList.add(input.nextLine());
                count--;
                System.out.println(count+ " u can enter fruits");
            }
            System.out.println(fruitList);

            for(int i=0;i<fruitList.size();i++){
                fruitList.set(i,fruitList.get(i).toUpperCase());
            }
            System.out.println(fruitList);

            //TASK
            // loop through your arrayList and print the element if it is start with "B"

            for(String s:fruitList){
                if(s.startsWith("B")){
                    System.out.println(s);
                }
            }
            for(int i=0; i<fruitList.size();i++){
                if(fruitList.get(i).startsWith("B")){
                    System.out.println(fruitList.get(i));
                }
            }


        }
    }


