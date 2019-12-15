package ArrayListPractice;

public class Animal {

    String name, area;
    int age, dailyMeal;

    public Animal(){
    }
    public Animal(String name, String area, int age, int dailyMeal){

        this.name=name;
        this.area=area;
        this.age=age;
        this.dailyMeal=dailyMeal;
    }
    public void increaseDailyMeal(){
        dailyMeal+=10;
    }
}
