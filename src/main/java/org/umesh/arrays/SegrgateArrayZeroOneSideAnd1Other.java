package org.umesh.arrays;

import java.util.Arrays;

public class SegrgateArrayZeroOneSideAnd1Other {
    public static void main(String[] args) {
        int arr[]={0,0,1,0,1,0,1,0,1,1,1};
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                count++;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (i<count){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
