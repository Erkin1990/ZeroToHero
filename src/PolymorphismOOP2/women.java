package PolymorphismOOP2;

public class women extends human implements mother{

    @Override
    public void eat(){
        System.out.println("women is eating");
    }
    @Override
    public void walk(){
        System.out.println("women is walking");
    }
    public void makeUp(){
        System.out.println("women is doing make up");
    }

    @Override
    public void takeCare() {
        System.out.println("Mother is taking care of family");
    }
}
