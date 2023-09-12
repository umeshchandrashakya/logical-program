package org.java8.feature.grupingby;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class GroupByTest {
    public static void main(String[] args) {
        Employee employee = new Employee(2,"rakesh",101,"active",2000);
        Employee employee1 = new Employee(3,"mukesh",102,"active",6000);
        Employee employee2 = new Employee(4,"rajeev",102,"active",4000);
        Employee employee3 = new Employee(5,"Ram",101,"active",2000);
        Employee demployee4 = new Employee(6,"Praksh",106,"in active",8000);

        List<Employee>list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(demployee4);

        //print employee based on dept;
        //count number of employee in each dept;
        //print active and inactive employee in
        // find max and min salary of emp:
        //print max salary of an employee from each dept;

        list.stream().collect(Collectors.groupingBy(Employee::getDepId,Collectors.toSet()));
        list.stream().collect(Collectors.groupingBy(Employee::getDepId,Collectors.counting()));
        list.stream().collect(Collectors.groupingBy(e->e.getActive().equalsIgnoreCase("Active"),Collectors.counting()));


/*
        Map<Integer, Set<Employee>> collect = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepId, Collectors.toSet()));
        collect.forEach((i,k)-> System.out.println("Dept: " +i+"Employee:  "+ k));

*/


      /*  Map<Integer, Long> collect1 = list.stream().collect(Collectors.groupingBy(Employee::getDepId, Collectors.counting()));
        collect1.forEach((key,value)-> System.out.println("dept: "+key+" no of emp: "+value));



        long active = list.stream().filter(i -> i.getActive().equalsIgnoreCase("active")).count();
        long inactive = list.stream().filter(i->i.getActive().equalsIgnoreCase("in active")).count();
        System.out.println("active: "+active+" inactive::"+inactive);


        Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee>min = list.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("Max salary: "+max.get());
        System.out.println("Min salary: "+min.get());
        list.stream().collect(Collectors.groupingBy(Employee::getDepId,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
*/
    }
}
