package InheritanceOOP3;

public class staticBlocks {

    String name;
    public static final String LEGALSTATUS;

    static{
        LEGALSTATUS="Citizen";
        System.out.println("I am block of StaticBlock class");
    }
    {
        System.out.println("I am an instance block of StaticBlock class");
    }
    public staticBlocks(){
        System.out.println("I am a constructor of staticBlock class");
    }
}
