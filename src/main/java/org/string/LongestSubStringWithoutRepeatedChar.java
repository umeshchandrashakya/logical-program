package org.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatedChar {
    public static void main(String[] args) {
    String s = "java";
    lengthOFLongestSubString(s);
    }

    public static void lengthOFLongestSubString(String s){
        String longestSubString = null;
        int longestSubstringLength = 0;
        Map<Character,Integer> map = new LinkedHashMap<>();
        char []arr = s.toCharArray();
        for (int i=0;i<arr.length;i++){
            char ch = arr[i];
            if (!map.containsKey(ch)){
                map.put(ch,i);
            }else {
                i = map.get(ch);
                map.clear();// clear the entry available in the map
            }
            if (map.size()>longestSubstringLength){
                longestSubstringLength = map.size();
                longestSubString = map.keySet().toString();
            }

        }
        System.out.println("length of longest substring:"+longestSubstringLength);
        System.out.println("longest substring without repeating charter : " +longestSubString);

    }
}
