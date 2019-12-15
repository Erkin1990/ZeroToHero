package PolymorphismOOP2;

public class boy extends men {

    @Override
    public void eat(){
        System.out.println("Boy is eating");
    }
    public void run(){
        System.out.println("Boy is running");
    }
    public void cry(){
        System.out.println("Boy is crying");
    }
}
