package Wrapper;

public class WrapperClasses {

    public static void main(String[] args) {
        // Important thing related with byte and short.
        // Once you create object from byte and short, you need to cast them.
        Byte by = new Byte((byte) 12);
        Short sh = new Short((short) 20);
        Integer in = new Integer(50);
        Long ln = new Long(45092);
        Double db = new Double(50.9);
        Float fl = new Float(43.89f);
        Boolean bl = new Boolean(true);
        Character ch = new Character('P');
        Byte by1 = new Byte("12");
        // even though I gave the value as a String, java will convert them to the Object
        Short sh1 = new Short("44");
        System.out.println(sh1);
        // THIRD WAY
        Integer num = 198;
        Short num1 = 54;

        // if you provide the value directly without new keyword. You don't need to cast.
        // What is the difference between Object and Primitives
        // In object we can call the methods but in primitive data types we don't have method.
        // TERM
        // What is the meaning of instance of the class?
        // instance of the class means, it is object from the class.
        // byte i;
        // i=50;  --> initialization of the primitive data types
        // Boolean bl=new Boolean(false); --> Instantiating the object.

        int number = 55;// null
        Integer computers = null;
        //number=computers;
        // it will not give the compile time error.
        //However, It will give the runtime error.
        System.out.println(number);
        // Converting From String to Primitive data types.
        String values = "455";
        // 127 * -128
        int valueInt = Integer.parseInt(values);
        System.out.println(valueInt);
        String convertBl = "True";
        boolean convert = Boolean.parseBoolean(convertBl);
        System.out.println(convert);
        String intValue = "900";
        int vl = Integer.parseInt(intValue);
        System.out.println(vl == 900);
        // If you converting String value of boolean to the primitive,
        // all values other than true or false, it will assign as a false;
        String table = "true";
        Boolean tb = Boolean.valueOf(table);
        System.out.println(tb);
        String chair = "C";
        Character ch2 = new Character('C');
//        int phone=Integer.parseInt("a");
//
//        System.out.println(phone);// It will give the NumberFormatException
//        Integer phone=Integer.valueOf("12.56");
//
//        System.out.println(phone);
        // Since the value is double it will give NumberFormatException
        int mouse = 6;
        Integer mouse1 = mouse;
        // mouse primitive is assigned as a Wrapper class object.
        // AutoBoxing is automatic conversion from primitive to wrapper class object.
        // AutoBoxing is for every primitive data types.
        System.out.println(mouse1);
        char c = 'K';
        Character cr = c; // it is autoboxing
        boolean b = true;
        Boolean bn = b; // it is autoboxing
        Float ft = 15.10f;
        float ft1 = ft;
        // Java automatically convert from objects to the primitive.
        // It is called unboxing.
        Double money = 10000.99;
        double money1 = money;// it is unboxing
        // Unboxing can be apply for all the primitive data types.
        Character paper = '1';
        boolean bln = paper.isDigit(paper);
        System.out.println(bln);
        String stn = "9Un7box4ing1";
        paper.isAlphabetic(paper);
    }
}

