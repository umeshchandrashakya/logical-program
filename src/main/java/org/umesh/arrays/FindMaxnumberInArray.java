package org.umesh.arrays;

public class FindMaxnumberInArray {
    public static void main(String[] args) {
     int[] arr= {2,4,45,34,89};
        System.out.println(findMax(arr));
    }


    static int maxWithinRange(int arr[],int startIndex,int endIndex){
        int max = arr[startIndex];
        for (int i = startIndex;i<= endIndex;i++){
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    static int findMax(int arr[]){
        int max = arr[0];
        int cont=1;
        while (cont<arr.length){
            if (max<arr[cont]){
                max = arr[cont];
            }
            cont++;
        }
        return max;
    }
}
