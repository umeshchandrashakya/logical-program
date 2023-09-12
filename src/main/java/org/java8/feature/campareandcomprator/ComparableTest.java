package org.java8.feature.campareandcomprator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        StudentComapre studentComapre = new StudentComapre(1,"umesh");
        StudentComapre studentComapre1 = new StudentComapre(5,"Rakesh");
        StudentComapre studentComapre2 = new StudentComapre(18,"Muskan");
        StudentComapre studentComapre3 = new StudentComapre(7,"Ramesh");
        StudentComapre studentComapre4 = new StudentComapre(6,"Ganesh");
        ArrayList<StudentComapre>list = new ArrayList<>();
        list.add(studentComapre);
        list.add(studentComapre1);
        list.add(studentComapre2);
        list.add(studentComapre3);
        list.add(studentComapre4);
        Collections.sort(list);
        System.out.println(list);

    }
}
