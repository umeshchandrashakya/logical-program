package org.umesh.arrays;

public class MaximumWealth {
    public static void main(String[] args) {
         int arr[][]={{1,2,3},{1,4,5},{4,5,6}};
        int ans = findMaxWealthOfEmployee(arr);
        System.out.println(ans);
    }

    private static int findMaxWealthOfEmployee(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int employee=0;employee<arr.length;employee++){
            int sum =0;
            for (int account =0;account<arr[employee].length;account++){
                sum = sum+arr[employee][account];
            }
            if (sum>ans){
              ans = sum;
          }
        }
        return ans;
    }


}
