package org.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
       // reverseString("umesh");
        Stream.of("Umesh")
                .map(word-> new StringBuilder(word).reverse())
                .forEach(System.out::println);

    }

    public static void reverseString(String str){
        char ch[] = str.toCharArray();
        int start=0;
        int end =ch.length-1;
        while (start<=end){
            swap(ch,start,end);
            start++;
            end--;
        }
    }
    public static void swap(char ch[],int start,int end){
        char temp;
        temp = ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
        String str = new String(ch);
        System.out.println(start);
    }
}
