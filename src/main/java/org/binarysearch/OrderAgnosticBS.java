package org.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int []arr = {-10 ,0, 23,45,87,90,94,99};
        int target = 23;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    private static int binarySearch(int[] arr, int target) {
    int start =0;
    int end = arr.length-1;
    boolean isAsc = arr[start]<arr[end];
        while (start <= end) {
            //find the middle element.
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
