package org.to20stream.api;

//1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
//2.Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//3.How to find duplicate elements in a given integers list in java using Stream functions?
//4.Given the list of integers, find the first element of the list using Stream functions?


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top20StreamApiQuestion {
    public static void main(String[] args) {
        float redius,pi,area;
        redius=11.2F;
        pi=3.14F;
        area=pi*redius* redius;
        System.out.println(area);

       // list.stream().filter(i->i%2==0).sum().forEach(System.out::println);

        //2
        //list.stream().map(item->Integer.toString(item)).filter(s->s.startsWith("1"))
            //    .forEach(System.out::println);

        //int arr[]={10,20,40,50,110,151,1,2,-1,-20,-9};
             //   Arrays.stream(arr).mapToObj(Integer::toString)
                   //    .filter(s->s.startsWith("1")).forEach(System.out::println);


        //find single digit number
       // list.stream().filter(i->(i<10 && i>-10)).forEach(System.out::println);

        //find duplicate numbers
       // Set<Integer>set = new HashSet<>();
       // list.stream().filter(item->!set.add(item)).forEach(System.out::println);

        //find the first element
       // Integer integer = list.stream().findFirst().get();
       // System.out.println(integer);

        //count total number of element in the list
        //long count = list.stream().count();
        //System.out.println(count);

        //find the max value
       /* Integer integer = list.stream().max(Integer::compare).get();
     //   System.out.println(integer);
        Integer integer1 = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }).get();
        System.out.println(integer1);
        Integer integer2 = list.stream().max(((o1, o2) -> o1 - o2)).get();
        System.out.println(integer2);*/


        //find the fist non repeated character
        String input = "Java articles are Awesome";
        String s = Arrays.stream(input.split(""))
                       .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst().get();
        System.out.println(s);

        //Count number of occurences




    }
}
