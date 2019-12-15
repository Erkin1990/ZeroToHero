package InheritanceOOP2;

public class SchoolBus extends bus {

    @Override
    public Double maxSpeed(){
        return 60.5;
    }
    @Override
    public String  busName(){
        return "School bus";
    }

}
