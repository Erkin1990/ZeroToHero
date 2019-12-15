package ConstructorPractice;

public class Company {
    String name;
    String location;
    String area;
    int employeeNumber;
    int budget;
    // create the constructor with no argument
    public  Company(){
    }
    // create three argument constructor and initialize the values for
    // name, location, area.
    public Company (String name, String location, String area){
        this.name=name;
        this.location=location;
        this.area=area;
    }
    public Company(String name, String location, String area, int employeeNumber, int budget){
        this(name,location,area);
        this.employeeNumber=employeeNumber;
        this.budget=budget;
    }
    // NOTE: you can not create same CONSTRUCTOR AGAIN!
    public void displayCompanyInfo(){
        System.out.println("company name "+name);
        System.out.println("company location "+location);
        System.out.println("company area "+area);
        System.out.println("employee number "+employeeNumber);
        System.out.println("budget is "+budget);
    }

    public static void main(String[] args) {
        Company company=new Company(); // constructor
        Company company1=new Company("Zara", "Schaumburg","Retail");
        System.out.println(company1.name);
        System.out.println(company1.employeeNumber);
        company1.employeeNumber=50;
        System.out.println(company1.employeeNumber);
        Company company2=new Company("Chase", "Chicago", "Finance", 400, 20000);
        System.out.println(company2.area);
        company2.displayCompanyInfo();
    }


}





