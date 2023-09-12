package org.umesh.arrays;

import java.util.Arrays;

public class CompareToArrayHaveSameContent {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,9};
        int arr2[]={1,2,3,4,8,9};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println(equals);
    }
}
