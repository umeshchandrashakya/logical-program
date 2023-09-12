package org.binarysearch;

public class FIndTheCelingNumer {
    // celling number is the number which is smallest grater than target
    //

    public static void main(String[] args) {
        int arr[]={2,4,5,7,9,23,34,50};
        int target = 25;
        //for target 6, 7 will be the smallest and grater than target.
        //return the smalled number>=target
       int ans = findCellingNumber(arr,target);
        System.out.println(ans);

    }

    private static int findCellingNumber(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        //int mid = (start+end)/2;//might be possible it will exceed the limit of int
        //but if target is grater than the grates number in the array.
        if (target>arr[arr.length-1]){
            return -1;
        }
        while (start <= end) {
            int mid1 = start + (end-start)/2;

            if (target < arr[mid1]) {
                end = mid1 - 1;
            }else if (target > arr[mid1]){
                start = mid1+1;
            }else {
                return  mid1;
            }
        }
     return start;
    }
}
