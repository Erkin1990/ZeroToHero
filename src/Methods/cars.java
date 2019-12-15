package Methods;

public class cars {

    public static void main(String[] args) {
        car car1=new car();
        car1.make="Toyota";
        car1.model="Camry";
        car1.year=2018;
        car1.price=20000;

        car car2=new car();
        car2.make="Porsche";
        car2.model="Cayenne";
        car2.year=2015;
        car2.price=50000;

        car1.drive();
        car1.stop();
        System.out.println(car1.getPrice());

        car2.drive();
        System.out.println(car1.year);
        car1.changePrice(18000);
        System.out.println(car1.getPrice());
        car1.changePrice(15000);
        System.out.println(car1.getPrice());

        String name=new String();
    }
}
