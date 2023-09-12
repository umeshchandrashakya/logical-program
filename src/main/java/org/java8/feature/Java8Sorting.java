package org.java8.feature;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Sorting {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("mango");
        list.add("banana");
        list.add("orange");
        list.add("grapes");

        System.out.println(list);
        //one way to sort in ascending
        //list.stream().sorted((s,s1)->s.compareTo(s1)).forEach(System.out::println);
        //in descending order
       // list.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);
        //default sorting order
       // list.stream().sorted().forEach(System.out::println);

     //   list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("umesh",78,33000,"B"));
        employeeList.add(new Employee("rakesh",29,37000,"A"));
        employeeList.add(new Employee("mahesh",42,30000,"C"));
        employeeList.add(new Employee("mukesh",36,38000,"D"));




// employeeList.stream().sorted(new Comparator<Employee>() {
//    @Override
//    public int compare(Employee e1, Employee e2) {
//        return e1.getGrade().compareTo(e2.getGrade());
//    }
//  }).forEach(System.out::println);

        //sorted employee based on the age
       // employeeList.stream().sorted((e1,e2)-> e1.getAge()-e2.getAge()).forEach(System.out::println);
        // employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed());

        Set<String> set = new HashSet<>();
        set.add("umesh");
        set.add("uuuu");
        System.out.println(set.size());

    }
}
