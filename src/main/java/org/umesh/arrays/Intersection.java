package org.umesh.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {

    public static void main(String[] args) {
        int arr[]={2,3,4,6,7};
        int arr1[]={4,6};
        System.out.println(findInterSection(arr,arr1));
    }
    public static HashSet findInterSection(int []nums1,int[]nums2){
        HashSet<Integer>hashSet = new HashSet<>();

        for (int i=0;i<nums1.length-1;i++){
            for (int j=0;j<nums1.length-1;j++){
                if (nums1[i]==nums2[i]){
                    hashSet.add(nums1[i]);
                }
            }

        }
        return hashSet;

    }
}
