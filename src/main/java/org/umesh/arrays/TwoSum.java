package org.umesh.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(findTwoSum(arr,target)));
    }
   static int[]findTwoSum(int arr[],int target){
        //int j=1;
        int sum =0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                sum=arr[i]+arr[j];
                if (sum==target){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
       return new int[]{-1,1};
    }
}
