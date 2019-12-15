package Variables;

public class UneryOperator {

    public static void main(String[] args) {

        int studentAge=25;

                studentAge++;
                //26
                studentAge--;
                //25
                ++studentAge;
                //26
                --studentAge;
                //25

        studentAge=studentAge++;
        //25
        studentAge=++studentAge;
        //26

        System.out.println(studentAge);


    }
}
