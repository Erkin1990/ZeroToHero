package Methods;

public class Cat {

    String cat1;
    int age;
    String kind;
    String color;
    int speed;
    boolean IsRunning;

    public void displayInfo(){

        System.out.println(cat1);
        System.out.println(age);
        System.out.println(kind);
        System.out.println(color);
        System.out.println(IsRunning);

    }
    public String getName() {
        return cat1;
}
    public int getYear() {
        return age;
    }
    public String getKind(){
        return kind;
    }


    public String getColor(){
        return color;

    }
    public int getSpeed(){
        return speed;

    }

}

