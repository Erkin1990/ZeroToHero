package AbstractionOOP;

public class OnlineStudent extends Student {


    // we need to implement abstract methods from Student class

    @Override
    public void study() {
        System.out.println("Online students are studying harder");

    }

    @Override
    void attendClass() {
        System.out.println("They are attending through webinar");
    }


}