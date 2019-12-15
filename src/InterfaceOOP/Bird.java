package InterfaceOOP;

public class Bird implements Flyable, Sound {


    @Override
    public void fly() {
        System.out.println("bird is flying");
    }
    @Override
    public void makeNoise() {
        System.out.println("Chik chik");
    }
}
