package org.string;

import java.util.Arrays;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "java word";
        //output avaj droW
        String arr[]= str.split(" ");
        for (int i=0;i<arr.length;i++){
            System.out.println(reverseWord(arr[i]));
        }
    }

    private static String  reverseWord(String s) {
        char ch[] = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String st = new String(ch);
        return st;
    }

}
