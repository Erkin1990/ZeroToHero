package Methods;

public class car {

    String model;
    int year;
    String make;
    int price;

    public void drive() {
        System.out.println(make + " " + model + " is driving");
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void stop() {
        System.out.println(model + " is stopping");
    }

    public void changePrice(int newPrice) {
        price = newPrice;
        getPrice();

    }
}


