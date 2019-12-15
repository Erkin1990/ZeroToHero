package AbstractionOOP2;

public class Triangle extends Shape {

    int height;
    int width;

    public Triangle(String name){
        super(name);
    }
    @Override
    public double calculateArea() {
        return height*width/2;
    }
    @Override
    protected void draw() {
        System.out.println("I am drawing triangle");

    }
}
