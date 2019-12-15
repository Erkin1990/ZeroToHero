package InheritanceOOP2;

import java.lang.annotation.Inherited;

public class camry extends car {

    public camry(){
        super();
    }
    @Override
    public Integer velocity(){
        return 125;
    }
}
