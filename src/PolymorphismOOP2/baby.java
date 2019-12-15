package PolymorphismOOP2;

public class baby extends boy {

    @Override
    public void eat(){
        System.out.println("Baby is crying");
    }
    @Override
    public void cry(){
        System.out.println("Baby is crying");
    }
    public void  crawl(){
        System.out.println("Baby is crawling");
    }
}
