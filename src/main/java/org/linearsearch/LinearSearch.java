package org.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,6,90,20};
        //find the number 90 exist or not.
        int targetNum=90;
        //search the item in array if found return the index.
        for (int i=0;i<arr.length;i++){
            if(targetNum==arr[i]){
                System.out.println(i);
            }
        }
    }
}
