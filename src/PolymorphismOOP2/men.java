package PolymorphismOOP2;

public class men extends human implements dad{

    @Override
    public void eat(){
        System.out.println("Man is eating");
    }
    @Override
    public void walk(){
        System.out.println("Man is walking");
    }
    public void shave(){
        System.out.println("Playing soccer");
    }
    @Override
    public void feed(){
        System.out.println("Dad is feeding his family");
    }
}

