package ConstructorPractice;

public class ComputerTest {

    public static void main(String[] args) {

        Computer c=new Computer(); // I called no argument constructor

        Computer c1=new Computer("Apple", "OS", "Macbook", "Pro");

        Computer c2=new Computer(2015, 8, 13);

        System.out.println(c.getName()); // null
        System.out.println(c.getYear()); // 0

        c.setName("HP");

        System.out.println(c.getName());

        c.setName("Asus");

        System.out.println(c.getName());

        System.out.println(c1.getName()); // Apply

        c1.setName("Acer");

        System.out.println(c1.getName()); // Acer

        System.out.println(c2.getYear());

        System.out.println(c2.getMemory());

        System.out.println(c.getMemory());

        c.setMemory(12);

        System.out.println(c.getMemory());
        System.out.println("============================");


        // Create an array to store the computers c, c1, c2
        // and print the memory for al computer from array.

        Computer [] comList={c,c1,c2}; // if i have more computer, i need loop

        for(Computer cc: comList){
            System.out.println("is is from for each loop "+cc.getMemory());
        }





    }
}






