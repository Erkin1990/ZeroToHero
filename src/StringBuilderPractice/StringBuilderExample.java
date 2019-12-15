package StringBuilderPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder table = new StringBuilder();

        StringBuilder table1 = new StringBuilder("Rockwell");

        System.out.println(table);

        table.append("ikea"); // Dynamic Polymorphism --> Java doesn't know which method to call until runtime.
        // At runtime java will select method according to your parameter.

        System.out.println(table);

        table.append(10);

        System.out.println(table);

        table1.append(10.4);

        System.out.println(table1);
        StringBuilder success = new StringBuilder().append("Techtorial").append(2019);
        success.append("Best year ever ").append(true);

        System.out.println(success);

        new StringBuilder().append("Tech"); // new StringBuilder().append("Tech");

        System.out.println("Tech".charAt(0));

        StringBuilder computer = new StringBuilder();

        for (char i = 'a'; i <= 'z'; i++) {
            computer.append(i);
        }
        System.out.println(computer);

        StringBuilder success2 = new StringBuilder("Tech");
        success2.append("torial");

        System.out.println(success2);

        StringBuilder truth1 = success2.append("2019");

        System.out.println(success2);
        System.out.println(truth1);

        truth1 = truth1.append("Best").append("Summer");

        System.out.println(success2);
        System.out.println(truth1);

        success2.append(10);

        System.out.println(success2);
        System.out.println(truth1);

        StringBuilder tree=new StringBuilder("Oak");
        StringBuilder tree1=new StringBuilder("Oak").append("14");

        System.out.println(tree);
        System.out.println(tree1);

        char nm=tree.charAt(1);

        System.out.println(nm);
        System.out.println(tree); // If you call method nad return type is StringBuilder,in this case
        // your original StringBuilder value will change.
        //.append(); ---> StringBuilder

        int index=tree.indexOf("ak");

        System.out.println(index);

        int length=tree.length();
        String subs=tree.substring(1);

        System.out.println(length);
        System.out.println(subs); // ak
        System.out.println(tree); // Oak

        tree1.append("10").append(true).substring(5); // Oak 1410true
        tree1.append('K').append(6.4);

        System.out.println(tree1); // Oak 1410trueK6.4

        StringBuilder apple=new StringBuilder("Aple");

        apple.insert(2,"p");

        System.out.println(apple);

        apple.insert(5,"s number is 10");

        System.out.println(apple);
        System.out.println(tree);
        System.out.println(tree1);

        StringBuilder[] builders={tree, tree1, computer, apple};

        // Task store the hypen after 2 index is StringBuilder object

        for(StringBuilder b: builders){
            b.insert(2,"-");
        }
        System.out.println(Arrays.toString(builders));

        StringBuilder mouse=new StringBuilder("Microsoft");

        mouse.delete(0,3);
        // 0,1,2
        System.out.println(mouse); // rosoft

        mouse.deleteCharAt(2);

        System.out.println(mouse); // rooft

        // Example: mouse.deleteCharAt(9);  result : OutOfBoundException
        mouse.reverse();

        System.out.println(mouse); // tfoor

        // mouse.deleteCharAt(9);

        String mouse1=mouse.toString();
        String mouse2=mouse.substring(0);
        String mouse3=""+mouse;

        System.out.println(mouse3); //mouse

        StringBuilder camera=new StringBuilder("Camera");
        StringBuilder camera1=new StringBuilder("Camera");

        System.out.println(camera.equals(camera1));










    }
}