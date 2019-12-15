package InterfaceOOP;

public class example  {

    public static void main(String[] args) {

        Bird b=new Bird();
        b.fly();
        b.makeNoise();

        plane p=new plane();
        p.fly();
        p.makeNoise();

        Macy macy=new Macy();
        System.out.println(macy.countEmployees());
        macy.displayItem();
        }
    }