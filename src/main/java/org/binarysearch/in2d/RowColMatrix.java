package org.binarysearch.in2d;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45,},
                {28,29,37,48},
                {33,34,38,50}
        };
        int target = 30;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[]search(int [][]matrix,int target){
        int r = 0;
        int c = matrix.length-1;
        while (r<matrix.length && c>0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }else if (matrix[r][c] > target){
                c--;
            }else {
                r++;
            }
        }
       return new int[]{-1,-1};
    }
}
