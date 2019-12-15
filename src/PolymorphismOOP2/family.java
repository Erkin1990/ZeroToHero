package PolymorphismOOP2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class family {

    public static void main(String[] args) {

        human h=new baby();
        h.eat();
        h.shave();
        h.walk();
        ((baby)h).crawl();
        ((women)h).makeUp();

        System.out.println("==================");

        men m=new boy();

        ((boy)m).cry();
        ((baby)m).cry();

        dad d=new baby();
        d.feed();

        Collection coll=new ArrayList();

        coll.add(2);
        coll.add(5);
        coll.add(10);

        ((Set)coll).add(2);

    }
}
