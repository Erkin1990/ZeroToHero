package AbstractionOOP2;

public class Circle extends Shape{

    int radius;

    public Circle(String name){
        super(name);
    }
    @Override
    public double calculateArea() {
        return radius*radius*3.14;
    }
    @Override
    protected void draw() {
        System.out.println("I am drawing circle");

    }
}
