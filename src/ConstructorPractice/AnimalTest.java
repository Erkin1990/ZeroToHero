package ConstructorPractice;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal=new Animal();
        animal.eat();
        animal.weight=10;
        System.out.println(animal.weight);

    }
}
