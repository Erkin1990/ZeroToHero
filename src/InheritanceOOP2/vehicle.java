package InheritanceOOP2;

public class vehicle  extends  Object {

    String make;
    int year;

    public vehicle(){
        super();
    }
    public vehicle(String make){
        this();
        this.make=make;
    }
    public vehicle(String make, int year){
        this(make);
        this.year=year;
    }

    public static void main(String[] args) {

        vehicle v=new vehicle();
        vehicle v2=new vehicle("Toyota", 2018);
    }
}
