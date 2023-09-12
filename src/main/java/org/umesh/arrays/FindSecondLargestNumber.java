package org.umesh.arrays;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int []arr ={1,3,4,100,99};
        findSecondLargestNumber(arr);
    }
    public static void findSecondLargestNumber(int arr[]){
        int firstLargest=0;
        int secondLargest=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if (arr[i]>secondLargest){
                secondLargest =arr[i];
            }
        }
        System.out.println("first largest number: "+firstLargest);
        System.out.println("Second Largest number:"+secondLargest);

    }
}
