package org.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        printNumberOfOccurrences("abbbbbbcc");
    }

    private static void printNumberOfOccurrences(String str) {
        char []ch = str.toCharArray();
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        int count=1;
      for (int i=0;i<ch.length-1;i++){
          if (hashMap.containsKey(ch[i])){
              hashMap.put(ch[i],hashMap.get(ch[i])+1);
          }else {
              hashMap.put(ch[i],count);
          }
      }
      hashMap.forEach((item,value)->
              System.out.println(item+" number of times: "+value));

       String st="apple";
       Arrays.stream(st.split(""))
               .collect(Collectors.groupingBy(s->s,LinkedHashMap::new,
                       Collectors.counting()))
               .forEach((key,value)->System.out.println(key+""+value));


    }
}
