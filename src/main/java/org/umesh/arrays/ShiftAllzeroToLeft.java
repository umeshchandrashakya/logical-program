package org.umesh.arrays;

import java.util.Arrays;

public class ShiftAllzeroToLeft {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,8,0,9};
        int count= 0;
        int newArray[]=new int[arr.length];
        for (int number:arr){
            if (number!=0){
            newArray[count]=number;
            count++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
