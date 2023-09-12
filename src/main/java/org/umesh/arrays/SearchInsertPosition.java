package org.umesh.arrays;
//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[]={1,2,3,9};
        int target = 5;
        System.out.println(searchInsert(arr,target));

    }

    public static int searchInsert(int arr[],int target){
        int k=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
             k=i;
             break;
            }else if (arr[i]>target){
                k=i;
                break;
            } else {
              k=arr.length;
            }
        }
        return k;
    }
}
