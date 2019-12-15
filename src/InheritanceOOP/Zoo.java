package InheritanceOOP;

import java.util.LinkedHashMap;

public class Zoo {

    public static void main(String[] args) {

        WildAnimal wildAnimal=new WildAnimal();
        wildAnimal.eat();
        wildAnimal.run();

        System.out.println("=================");

        Animal an=new Animal();
       an.sleep();
       an.eat();

       DomesticAnimal domesticAnimal=new DomesticAnimal();
       domesticAnimal.run();
        System.out.println("----------------");

        Lion l=new Lion();
        l.eat();
        l.fight();
        l.run();
        System.out.println("----------------");

        Dog dog=new Dog();
        dog.bark();
        dog.run();
    }
}
