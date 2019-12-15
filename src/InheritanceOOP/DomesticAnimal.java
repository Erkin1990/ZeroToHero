package InheritanceOOP;

public class DomesticAnimal extends Animal{

@Override
    public void eat(){
    System.out.println("Domestic animal is eating meat");
}
@Override
    public void sleep(){
    System.out.println("Domestic animal is sleeping");
}
@Override
    public void run(){
    System.out.println("Domestic animal is running");
}


}
