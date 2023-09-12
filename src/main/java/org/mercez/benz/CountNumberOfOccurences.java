package org.mercez.benz;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNumberOfOccurences {
    public static void main(String[] args) {
        String str="aaansnsn";
        Stream<String> split = Stream.of(str.split(""));
        split.collect(Collectors
                .groupingBy(world->world,LinkedHashMap::new, Collectors.counting()))
                .forEach((key,value)->System.out.println(key+"->"+value));


        String str1 = "Apple";
        char ch[]=str1.toCharArray();
        LinkedHashMap<Character,Integer>linkedHashMap = new LinkedHashMap<>();
        Integer count=1;
        for (int i=0;i<ch.length;i++){
            if (linkedHashMap.containsKey(ch[i])){
                linkedHashMap.put(ch[i],linkedHashMap.get(ch[i])+1);
            }else {
                linkedHashMap.put(ch[i],1);
            }
        }
        for (Map.Entry<Character,Integer>entry:linkedHashMap.entrySet()){
            if (entry.getValue()==1){
               // System.out.println(entry.getKey());
              //  return;
            }
        }
        Character key = linkedHashMap.entrySet().stream()
                .filter(i -> i.getValue() > 1)
                .findFirst().get().getKey();

        System.out.println(key);

    }
}
