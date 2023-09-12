package org.mercez.benz;

import org.java8.feature.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHeighestsalry {
    public static void main(String[] args) {
        List<Employee>employees=new ArrayList<>();
        employees.add(new Employee("umesh",23,2550,"A"));
        employees.add(new Employee("Rakesh",30,3000,"A"));
        employees.add(new Employee("Dev",62,5000,"A"));
        employees.add(new Employee("Muskan",45,9000,"A"));
        //find the second highest salar[.length - 1]
        Optional<Employee> first =
                 employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary)
                        .reversed())
                .skip(1)
                         .findFirst();
        if (first.isPresent()){
            System.out.println(first.get().getSalary());
        }

    }
}
