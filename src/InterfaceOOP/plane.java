package InterfaceOOP;

public class plane implements Flyable, Sound {

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
    @Override
    public void makeNoise() {
        System.out.println("Bzhhhhhh");
    }
}
