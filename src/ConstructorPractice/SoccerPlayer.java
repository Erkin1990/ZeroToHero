package ConstructorPractice;

public class SoccerPlayer {


    String name;
    int age;
    String nationality;
    String teamName;
    double height;
    double weight;

    public SoccerPlayer(){

    }

    public SoccerPlayer(String name, int age, String country, String club, double height, double weight){

    }

    public void run(){
        System.out.println("Player is running");
    }
    public void run(String name){
        shoot();
        System.out.println(name+" is running");
    }
    public void shoot(){
        System.out.println("Soccer player is kicking the ball");
    }
    public void shoot(int speed){
        shoot();
        System.out.println("The speed of the shoot is "+speed);
    }
    public void shoot(int speed, int distance){
        shoot(speed);

        if(speed>50 && distance<25){

            System.out.println("it is goal");
        }else{
            System.out.println("it is not a goal");

        }
    }


    }



