package org.umesh.arrays;

public class FindSecondSmallestNumber {
    public static void main(String[] args) {
        int arr[]= {1,10,20,43,13,0,100};
        findSecondSmallestNumber(arr);
    }

    private static void findSecondSmallestNumber(int[] arr) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }else if (secondSmallest>arr[i]){
                secondSmallest = arr[i];
            }
        }
        System.out.println("first Smallest Number: "+firstSmallest);
        System.out.println("Second Smallest number:"+secondSmallest);
    }
}
