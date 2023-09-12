package org.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={8,2,7,9,67, 89};
        applyBubbleSort(arr);
    }

    private static void applyBubbleSort(int[] arr) {

        for (int i= 0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){

                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
