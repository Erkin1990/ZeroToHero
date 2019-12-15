package Exceptions;

public class CasinoAgeLimit {

    private  String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    public CasinoAgeLimit(String name, int age){
        this.name=name;
        this.age=age;
    }
    public static void casinoAccess(CasinoAgeLimit ageLimit) throws Exception {
        if(ageLimit.getAge()<21){
            throw new Exception("Hey, you cannot play in Casino!");
        }
        System.out.println(ageLimit.getName()+"Welcome to Casino!");
    }

    public static void main(String[] args) throws Exception {

        CasinoAgeLimit casinoAgeLimit=new CasinoAgeLimit("John", 21);
        casinoAgeLimit.casinoAccess(casinoAgeLimit);
        CasinoAgeLimit casinoAgeLimit1=new CasinoAgeLimit("David", 18);
        System.out.println("My code is finished");
    }
}