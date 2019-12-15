package InheritanceOOP;

public class Dog extends DomesticAnimal {


    public void bark(){
        System.out.println("Dog is barking");
    }
    @Override
    public void run(){
        System.out.println("Dog is running");
    }
}
