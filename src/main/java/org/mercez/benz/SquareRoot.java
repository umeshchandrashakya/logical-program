package org.mercez.benz;

public class SquareRoot {
    public static void main(String[] args) {
        int target = 5;
        System.out.println(getSquareRootOf(target));
    }

    private static int getSquareRootOf(int target) {
        int start=1;
        int end=target;
        int ans =0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid*mid==target){
                ans =mid;
                break;
            }else if (mid*mid<target){
                start =mid+1;
                ans=mid;
            }else {
                end =mid-1;
            }
        }
        return ans;
    }
}
