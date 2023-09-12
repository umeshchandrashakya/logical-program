package org.java8.feature.campareandcomprator.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student>list = new ArrayList<>();
        Student student = new Student(1,"Rajeev");
        Student student1 = new Student(19,"Ajeet");
        Student student2 = new Student(4,"Alok");
        Student student3 = new Student(9,"Muskan");
        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student1);
        //Collections.sort(list,new StudentIdComprator());
        System.out.println("Sorting based on the Student ID:");

        System.out.println("Sorting based on the name");
        ///Collections.sort(list,new StudentNameComparator());
       // System.out.println(list);
        //list.stream().sorted(item->Comparator.comparingInt((item)->item.getId())).forEach(System.out::println);

       /* Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               *//* if (o1.getId()==o2.getId()){
                    return 0;
                }else if(o1.getId()>o2.getId()){
                  return 1;
                }else {
                    return -1;
                }*//*
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        //
        //Collections.sort(list, (s1,s2)->s2.getName().compareTo(s1.getName()));

        //
        List<Student> collect = list.stream().sorted((s1, s2) -> s1.getId() - s2.getId()).collect(Collectors.toList());

        list.stream().sorted(Comparator.comparing(Student::getId).reversed()).forEach(System.out::println);


    }
}
