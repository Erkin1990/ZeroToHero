package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionPlusSort {

    public static void main(String[] args) {
        String[][] groupedNames={{"Adilet","Arslan", "Aitu", "Akylai"}, {"Nazire", "Yasmin", "Vitalii", "Nargiza"}};

        Scanner input=new Scanner (System.in);
        String name=input.next();

        for(int i=0; i<groupedNames.length; i++){
            for(int a=0; a<groupedNames[i].length; a++){
                Arrays.sort(groupedNames[i]);
                if(groupedNames[i] [a].equalsIgnoreCase(name)){
                    System.out.println(Arrays.deepToString(groupedNames));
                    System.out.println("In array  "+i+ "In order"+a);
                }
            }
        }



    }
}
