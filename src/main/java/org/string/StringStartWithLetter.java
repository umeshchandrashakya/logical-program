package org.string;

import java.util.Arrays;

public class StringStartWithLetter {
    public static void main(String[] args) {
        String[]str = {"apple","sample","search","temple"};
        String []ans = startWithLetter(str);
        System.out.println(Arrays.toString(ans));
    }
    public static String [] startWithLetter(String []str){
        String ans[]=new String[str.length];
        for (int i=0;i<str.length;i++){
            if (str[i].charAt(0)=='s'){
                ans[i]=str[i];
            }else {
                ans[i]="";
            }
        }
  return ans;
    }
}
