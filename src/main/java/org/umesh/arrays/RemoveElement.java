package org.umesh.arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
       int arr[]={1,2,2,3,4,5,2,2};
       int target =2;
        System.out.println(removeElement(arr,target));
    }
    public static int removeElement(int[] nums, int val) {
     int index=0;
     for (int i=0;i<nums.length;i++){
         if (nums[i]!=val){
             nums[index]=nums[i];
             index++;
         }
     }
     return index;
    }

}
