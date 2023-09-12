package org.string;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1= "dog";
        String s2 = "gdo";
        char ch1 []=s1.toCharArray();
        char ch2 [] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       // if (ch1.length==ch2.length)
        if(isAnagram(ch1,ch2)){
            System.out.println("String is anagram ");
        }


        }
        public static boolean isAnagram(char ch1[],char ch2[]){
        for (int i=0;i<ch1.length;i++){
            if (ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
        }

}
