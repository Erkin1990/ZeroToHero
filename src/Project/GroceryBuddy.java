package Project;

import java.util.ArrayList;

public class GroceryBuddy extends CheckOut {

    ArrayList<String> product = new ArrayList<String>();

    String[] fruit = {"Apple, Orange, Watermelon, Banana, Pineapple, Grape, Mango, Strawberry, Peach, Cherry"};
    String[] vegetables = {"Carrots, Broccoli, Onion, Potato, Tomato, Cucumber,Corn, Bean, Spinach, Pepper"};

    String[] otherProducts = {"Milk, Bread, Beef, Eggs, Chicken, Sugar ,  Salt, Coffee, Rice, Pasta "};

    double[] fruitsPrices = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69, 2.49, 4.99, 3.39, 1.79};

    double[] vegetablesPrices = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69, 2.49, 4.99, 3.39, 1.79};

    double[] otherProductsPrices = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69, 2.49, 4.99, 3.39, 1.79};

    public void printFruit() {
        for (String fruit : fruit) {
            System.out.println(fruit + "," + " ");
        }
    }

    public void printVegetables() {
        for (String vegetable : vegetables) {
            System.out.println(vegetable + " , ");
        }
    }

    public void printOtherProducts() {
        for (String otherProduct : otherProducts) {
            System.out.println(otherProduct + ",");
        }
    }

    public double itemPrice(String itemName) {
        for (int i = 0; i < otherProducts.length; i++) {
            if (otherProducts[i].equalsIgnoreCase(itemName)) {
                return otherProductsPrices[i];
            }
        }return -1;



    }
}

