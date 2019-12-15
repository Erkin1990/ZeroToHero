package InterfaceOOP2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneUser {

    public static void main(String[] args) {

        iPhone iPhone=new iPhone();
        iPhone.call();
        iPhone.text();
        iPhone.takePicture();

        Samsung samsung=new Samsung();

        List<String > list=new ArrayList<String>();
        Map<String,Object> map=new HashMap<String, Object >();
    }
}
