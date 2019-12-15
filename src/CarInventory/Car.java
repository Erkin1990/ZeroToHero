package CarInventory;

public class Car {

    public Car(String name){
        this.name=name;
    }
    public Car (String name, String model, int year, int price, String  vinNumber){
        this(name);
        this.model=model;
        this.year=year;
        this.price=price;
        this.vinNumber=vinNumber;
    }

    private String name;
    private String model;
    private int year;
    private int price;
    private String vinNumber;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getVinNumber(){
        return  vinNumber;
    }
    public void setVinNumber(String vinNumber){
        this.vinNumber=vinNumber;
    }
}
