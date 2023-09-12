package org.java8.feature.campareandcomprator.comprator;

import java.util.Comparator;

public class StudentIdComprator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getId()==o2.getId()){
            //return 0 based on id com
            //when two id equals then sort by name

            return o1.getName().compareTo(o2.getName());
        }else if (o1.getId()>o2.getId()){
           return 1;
        }else {
            return -1;
        }
    }
}
