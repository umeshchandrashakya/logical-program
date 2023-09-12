package org.binarysearch;



public class BinarySearch {

    public static void main(String[] args) {
        //to search element in array using binary search alo
        //.1 array must be sorted either ascending or descending order
        //2. take two pointer start and end.
        //3 find out the middle element.
        //4 check if middle element.
        // if middle element is grater then target
        // start = middle+1;
        // if middle element is lees than target
        // end = middle-1;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,22,56,98};
        int target=6;
       int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int arr[],int target){
       //return the index if item is found.
        //return -1 if not found.


        int start =0;
        int end = arr.length-1;
        //int mid = (start+end)/2;//might be possible it will exceed the limit of int

      int ans =0;
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
