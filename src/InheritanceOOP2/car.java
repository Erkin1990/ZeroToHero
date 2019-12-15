package InheritanceOOP2;

public class car extends vehicle {

    public car() {
        super("Toyota");
    }

    public car(String make) {
        super("Lexus");
    }

    public Integer velocity() {
        return 100;
    }
    public String CarName(){
        return "car";
    }
}
