package ClassPractice;

public class Cat {

    // (name, age, color, boolean, IsRunning;, kind, speed)

    String name;
    int age;
    String color;
    boolean isRunning;
    String kind;
    int speed;

    // what is the instance of the class? Means object of the class

    public boolean start(){
        isRunning=true;
        return isRunning;
    }
    public void run(String direction){
        System.out.println();
    }
    public boolean stop(){
        isRunning=false;
        return isRunning;
    }
    public void run(String direction, int distance){
        System.out.println("Cat direction is"+direction+ "The running distance is "+distance);
    }
    public void catInfo(){
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Color"+color);
        System.out.println("Kind"+kind);
        System.out.println("Speed"+speed);
        System.out.println("IsRunning"+isRunning);
    }
    public void accelerate(int targetSpeed){

        while(speed<targetSpeed){
            System.out.println(speed);
            speed++;
        }
        }
        public void slowDown(int targetSpeed){
        while(speed>targetSpeed){
            System.out.println(speed);
            speed--;
        }
    }

    public static void main(String[] args) {
        Cat dodo=new Cat();
        dodo.name=" dodo";
        dodo.age= 1;
        dodo.color=" gray";
        dodo.kind=" Scottish";

        dodo.catInfo();
        dodo.start();
        dodo.catInfo();
        dodo.accelerate(10);
        System.out.println();
        dodo.slowDown(5);


    }


}
