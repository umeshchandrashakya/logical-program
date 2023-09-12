package org.string;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesCharacters {
    public static void main(String[] args) {
        String str = "java";
        StringBuilder stringBuilder = new StringBuilder();
        //str.chars().distinct().forEach(item -> stringBuilder.append((char) item));
        Arrays.stream(str.split("")).distinct().forEach(stringBuilder::append);
        System.out.println(stringBuilder);

        //approach-2
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
           char ch =  str.charAt(i);
           int index = str.indexOf(ch,i+1);
           if (index==-1){
               stringBuilder1.append(ch);
           }
        }
     //   System.out.println(stringBuilder1);


        //approach-3
        StringBuilder sb3 = new StringBuilder();
        char ch[]= str.toCharArray();
        for (int i=0;i<ch.length;i++){
            boolean repeated = false;
            for (int j=i+1;j<ch.length;j++ ){
                if (ch[i]==ch[j]){
                  repeated = true;
                }
            }
            if (!repeated){
                sb3.append(ch[i]);
            }
        }
      //  System.out.println(sb3);
        //Approach -4
        StringBuilder stringBuilder2  = new StringBuilder();
        HashSet<Character> linkedHashSet = new LinkedHashSet();
        for (int i=0;i<str.length();i++){
            linkedHashSet.add(str.charAt(i));
        }
        for (Character c :linkedHashSet){
         stringBuilder2.append(c);
        }
        System.out.println(stringBuilder2);


    }


}
