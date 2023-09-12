package org.mercez.benz;

import java.util.Arrays;

public class TwoSumEqualToTarget {
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int target =15;
        System.out.println(Arrays.toString(findTowSum(arr,target)));
    }

    public static int []findTowSum(int arr[],int target){
        int ans[]={-1,-1};
        for (int i=0;i<arr.length-1;i++){
            for (int j=i;j<arr.length;j++){
                if (i!=j && arr[i]+arr[j]==target){
                    ans=new int[]{i,j};
                }
            }
        }
        return ans;
    }
}
