package StaticPractice;

public class Book {

    String name;   // I want to store only business books
    String kind;   // It will be always same author (Jim Jones)
    String author;
    int pages;
    int count;

        // Instance initialization block
        // We are using this block to initialize out instance variables
        {
            kind="Busness Book";
            author="Jim Jones";
            count++;

            System.out.println("This is initialization block");
        }
        static{
            // We are using static block to initialize our instance variables.

            System.out.println("This is static block. I am running only one time");
        }
        public Book(String name, int pages){

            this.name=name;
            this.pages=pages;
        }




}
