package ArrayListPractice;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal1=new Animal("Cat","Chicago",1,5);
        Animal animal2=new Animal("Dog","New York",2,7);
        Animal animal3=new Animal("Lion","San Diego",3,15);
        Animal animal4=new Animal("Monkey","Arizona",4,10);
        Animal animal5=new Animal("Tiger","Florida",5,18);

        System.out.println(animal5.dailyMeal);

        ArrayList<Animal> animalList=new ArrayList();

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);

        for(int i=0;i<animalList.size();i++){

            animalList.get(i).increaseDailyMeal();
            System.out.println(animalList.get(i).dailyMeal);

        }
    }
}
