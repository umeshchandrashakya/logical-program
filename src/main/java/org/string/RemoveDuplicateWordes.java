package org.string;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordes {
    public static void main(String[] args) {
        String str ="good day bye bye";
        removeDuplicates(str);
    }
    public static void removeDuplicate(String str){
        String []arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        linkedHashSet.forEach(item-> System.out.print(item+" "));
    }

    public static void removeDuplicates(String str){
        String [] arr = str.split(" ");
        String result= "";
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i!=j && arr[i].equals(arr[j])){
                    arr[j]="remove";
                }
            }
        }
        for (String word:arr){
            if (!word.equals("remove"))
          result = result+word+" ";
        }
        System.out.println(result);
    }
}
