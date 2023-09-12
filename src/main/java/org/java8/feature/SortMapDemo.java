package org.java8.feature;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("umesh", 5);
        map.put("ravi",9);
        map.put("kamal kumar",3);
        List<Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        map.entrySet().stream().sorted(new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
             return o1.getKey().compareTo(o2.getKey());
            }
        });

        int arr[]={12,34,56,67,89};


     //   map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
     //  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
       // System.out.println(map);

        Map<Employee,Integer> employeeIntegerMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        employeeIntegerMap.put(new Employee("ramesh",29,2300,"A"),2);
        employeeIntegerMap.put(new Employee("ajeet",30,2400,"C"),8);
        employeeIntegerMap.put(new Employee("ramesh",60,2900,"D"),9);
        System.out.println(employeeIntegerMap);

        Set<Employee> set = new TreeSet<Employee>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //
        set.add(new Employee("ramesh",29,2300,"E"));
        set.add(new Employee("niru",79,78000,"D"));
        set.add(new Employee("ajeeta",80,7600,"C"));
       // System.out.println(set);
        Set<Employee> collect = set.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toSet());
       // collect.forEach(System.out::println);

    }
}
