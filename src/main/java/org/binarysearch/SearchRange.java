package org.binarysearch;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        //given an array of integer nums sorted in ascending order
        // find the starting and ending position of given target
        // if target is not found in the array return [-1,-1]
        System.out.println(Arrays.toString(findRange()));
    }
    public static int [] findRange(){
        int arr[]={2,7,7,7,7,8,8,8,9,9};
        int target = 8;
        int start = searchRange(arr,target,true);
        int end = searchRange(arr,target,false);
        int ans[]={-1,-1};
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public static int searchRange(int nums[],int target,boolean findStartIndex ){
        int start = 0;
        int end = nums.length - 1;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
