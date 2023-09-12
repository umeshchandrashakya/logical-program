package org.string;

public class StringPalindrom {
    public static void main(String[] args) {
        System.out.println(checkGivenStringIsPalindrom("abbba"));
    }
    public static boolean checkGivenStringIsPalindrom(String str){
        char[]chars = str.toCharArray();
        int start=0;
        int end = chars.length-1;
        boolean ans=false;
        while (start<=end){
            if (chars[start]==chars[end]){
                start++;
                end--;
                ans =true;
            }else {
                ans =false;
                break;
            }
        }
        return ans;
    }
}
