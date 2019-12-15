package InterviewTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Programmer {

    List<String> languages=new ArrayList<>();

    public Collection<String> getAllLanguages(){

        return languages;
    }
    public void addLanguages(String language){
        languages.add(language);
    }

}
