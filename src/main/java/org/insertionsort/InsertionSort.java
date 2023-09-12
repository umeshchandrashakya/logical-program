package org.insertionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,3};
        System.out.println(Arrays.toString(insertionSort(arr)));
        ArrayList arrayList  = new ArrayList();

     StringBuilder stringBuilder = new StringBuilder();
    }

    private static int [] insertionSort(int[] arr) {
        for (int i=0; i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else {
                    break;
                }
            }
        }
        return arr;
    }
}
