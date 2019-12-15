package StaticPractice;
import StaticPractice.StaticReview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static StaticPractice.StaticReview.*;
import static java.lang.Math.*;
public class StaticTest {

    public static void main(String[] args) {

        StaticReview rev=new StaticReview();
        StaticReview rev1=new StaticReview();

        StaticReview.test();
        rev.test1();

        test();

        System.out.println(addExact(10,-5));

        System.out.println();
        System.out.println();
        System.out.println();

        List<Integer> num=new ArrayList<>();

        num.add(1);
        num.add(4);
        num.add(2);

        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);


    }
}
