package CarInventory;
import CarInventory.Car;

import java.util.ArrayList;
public class CarInventory1 {
    private String dealerName;
    public CarInventory1(String dealerName){
        this.dealerName=dealerName;
    }
    public void getCarName(ArrayList<Car> carList){
        for (Car c: carList){
            System.out.println(c.getName());
        }
    }
    public void getVinNumber(ArrayList <Car> carList){
        for (Car v: carList){
            System.out.println(v.getVinNumber());
        }
    }
    public void getPrice(ArrayList <Car> carList){
        for (Car c: carList){
            System.out.println(c.getPrice());
        }
    }
    public void getModelYear(ArrayList <Car> carList){
        for (Car v: carList){
            System.out.println(v.getYear());
        }
    }
    //create the method to print vinNumbers of the car
    //10P84A            2010
    public void setModelYear(ArrayList <Car> carList, String vinNumber, int year){
        for (int i=0; i<carList.size(); i++){
            if (carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)){
                carList.get(i).setYear(year);
            }
        }
    }
    public void setModelPrice(ArrayList <Car> carList, String vinNumber, int price ){
        for (int i=0; i<carList.size(); i++){
            carList.get(i);
            if (carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)){
                carList.get(i).setPrice(price);
            }
        }
    }
    public void addNewCar(ArrayList <Car> carList, Car newCar){
        boolean hasCar= false;
        for (Car c: carList){
            if( c.getVinNumber().equalsIgnoreCase(newCar.getVinNumber())){
                System.out.println("the car is already in the inventory");
                hasCar=true;
            }
        }
        if (!hasCar){
            carList.add(newCar);
            System.out.println(newCar.getName());
            System.out.println("the new car is added to your inventory");
        }
    }
    public void removeCar(ArrayList <Car> carList,String vinNumber) {
        for (Car c : carList) {
            if(c.getVinNumber().equalsIgnoreCase(vinNumber)){
                carList.remove(c);

            }
        }
    }
    public static void main(String[] args) {
        Car car1=new Car("Toyota", "Corolla", 2016, 10000, "12V87K");
        Car car2=new Car("Mercedes", "C300", 2017, 16000, "10P84A");
        Car car3=new Car("Ford", "Malibu", 2010, 5000, "19Q371");
        Car car4=new Car("Toyota", "Camry", 2009, 7000, "14M67L");
        Car car5=new Car("BMW", "X6", 20154, 25000, "90T51W");
        Car car6=new Car("Porsche", "Panamera", 2018, 50000, "33R00U");
        Car car7=new Car("Porsche", "Panamera", 2018, 50000, "33R00U");
        //create inventory dealer and give the name
        CarInventory.CarInventory1 dealer=new CarInventory.CarInventory1("AutoNation");
        ArrayList <Car> carList=new ArrayList<Car>();
        carList.add(car5);
        carList.add(car7);
        carList.add(car2);
        dealer.getCarName(carList);
        dealer.getVinNumber(carList);
        dealer.getModelYear(carList);
        dealer.setModelYear(carList, "10P84A", 2010);
        dealer.getModelYear(carList);
        dealer.setModelPrice(carList,"101097A ", 25000);
        dealer.getPrice(carList);
        dealer.addNewCar(carList, car1);
        dealer.addNewCar(carList, car1);
        dealer.addNewCar(carList, car6);
        dealer.addNewCar(carList, car3);
        dealer.getCarName(carList);
        dealer.removeCar(carList, "12V87K");
        System.out.println("This list is after removing the car");
        dealer.getCarName(carList);
    }
}





