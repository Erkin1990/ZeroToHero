package Methods;

public class arrayMethods {

    String studentName;
    String[] students=new String[5];
    int count;

    public void addStudent(){
        students[count]=studentName;
        count ++;
    }

    public void printNames(){
        for(String name: students){
            System.out.println(name);
        }
    }

}
