package org.mercez.benz;

import java.util.Arrays;
import java.util.stream.Stream;



public class ReverseString {
    public static void main(String[] args) {
        String str="umesh";
       /* Stream.of(str).map(word->new StringBuilder(word).reverse())
                .forEach(item->System.out.println(item));*/
        char arr[]=str.toCharArray();
        reverserString(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverserString(char[] arr) {
        int start=0;
        int end=arr.length-1;
        System.out.println(end);
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void swap(char arr[],int start, int end){
        char temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
