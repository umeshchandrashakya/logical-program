package org.java8.feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHeigstSlaryOfEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("umesh",29,2000,"A");
        Employee employee1 = new Employee("Rakes",30,6000,"A");
        Employee employee2 = new Employee("muskan",29,9000,"A");
        Employee employee3 = new Employee("Rajee",40,8000,"A");
        List<Employee>list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        Optional<Employee> first = list.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary)
                        .reversed()).skip(1).findFirst();
        System.out.println(first.get().getSalary());
    }
}
