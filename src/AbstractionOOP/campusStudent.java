package AbstractionOOP;

public class campusStudent extends Student {

    @Override
    public void study() {
        System.out.println("Campus student is studying");
    }
    @Override
    public void attendClass() {
        System.out.println("Student is taking class in campus");
    }
    @Override
    public void homework(){
        System.out.println("Campus student is doing his/her homework");
    }
}
