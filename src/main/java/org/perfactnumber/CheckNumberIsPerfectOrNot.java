package org.perfactnumber;

public class CheckNumberIsPerfectOrNot {
    public static void main(String[] args) {
     if (isPerfectNum(6))
         System.out.println("is perfect no {}::"+6);
     else
         System.out.println("not perfect");

    }

    public static boolean isPerfectNum(int num){
        int i=1;
        int sum=0;
        while (i <= num/2){
            if (num % i==0){
                sum = sum+i;
            }
            i++;
        }
        if (sum==num){
            return true;
        }else
            return false;
        }


}
