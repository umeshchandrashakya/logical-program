package org.umesh.arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9,10,11,12,14,15,20,22,23,25};
        System.out.println(ans(arr,15));
    }

    public static int ans(int arr[],int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
                int temp  = end+1; //this is the newStart
                //double the box value.
                //end = end+ sizeofthebox*2;
                end = end+(end-start+1)*2;
                start = temp;
            }
            return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int arr[],int target,int start,int end){
        //return the index if item is found.
        //return -1 if not found.
        //int mid = (start+end)/2;//might be possible it will exceed the limit of int
        while (start <= end) {
            int mid1 = start+(end-start)/2;
            if (target<arr[mid1]) {
                end = mid1 - 1;
            }else if (target>arr[mid1]){
                start = mid1+1;
            }else {
                return  mid1;
            }
        }

        return -1;
    }

}
