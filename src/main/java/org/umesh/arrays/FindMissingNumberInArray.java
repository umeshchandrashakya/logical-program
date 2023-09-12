package org.umesh.arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
     int arr[]={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int arr[]){

        int n = arr.length;
        int sum = (n+1)*n/2;
        int arrayDigitSum = 0;
        for (int i =0;i<arr.length;i++){
            arrayDigitSum = arrayDigitSum+arr[i];
        }
        return sum-arrayDigitSum;
    }
}
