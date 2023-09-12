package org.linearsearch;


import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr={
                {23,67,0},
                {56,89,9},
                {7,8,9,80}
        };
        int target = 80;
         int ans[]=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Max value:"+findMax(arr));
    }

    static int[] search(int[][]arr,int target){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length; col++){
                if (target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int findMax(int arr[][]){
        int max = Integer.MIN_VALUE;
        for (int row=0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if (arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
