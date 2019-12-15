package InterfaceOOP;

public class Macy implements Store  {
    @Override
    public void sellItem() {
        System.out.println("Macy's selling shoes");
    }
    @Override
    public int countEmployees() {
        return 250;
    }
}
