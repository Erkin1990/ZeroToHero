package InterfaceOOP2;

public interface flashCard extends faceRecognition {

    // public static final int SIZE=128;
    int SIZE=128;

    // public abstract void location();
    void location();

    default void regularMethod(){
        System.out.println("Regular method from flashCard interface");
    }
    static void staticMethod(){
        System.out.println("Static method from flashCard Interface");
    }

}
