package InterfaceOOP;

public interface Store {

    // all variables of interface are:
    // public static final
    // public static final int capacity
    int CAPACITY=20;

    // public abstract void sellItem();
    void sellItem();

    int countEmployees();

    default void displayItem(){
        System.out.println("Displaying item in Store Interface");
    }
}
