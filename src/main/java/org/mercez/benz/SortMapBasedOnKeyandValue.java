package org.mercez.benz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapBasedOnKeyandValue {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("umesh",234);
        map.put("Rakesh",24);
        map.put("Ramesh",289);


       // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
       // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

     /*   map.entrySet().stream().sorted(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        }).forEach(System.out::println);*/
        map.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).forEach(System.out::println);


    }
}
