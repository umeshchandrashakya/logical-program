package org.binarysearch;

public class MountainArray {
    public static void main(String[] args) {
        //find the peek element from the given array
        int arr[]={1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(arr[findPeekOrMaxElement(arr)]);
    }

    public static int findPeekOrMaxElement(int arr[]){
        int start=0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                //we are at the decreasing part of the array
                //this may be the ans but look at left
                //this is why end!=mid-1;
                end = mid;
            }else{
                //you are in the asc part of the array
                //
                start = mid+1; //because we know that mid+1 element > mid element hence
            }
        }
        // in the end start==end and pointing to the largest number
        return start;

    }

}
