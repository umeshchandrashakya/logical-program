package org.example;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkNumberIsPrimeOrNot(29));
    }
    public static boolean checkNumberIsPrimeOrNot(int input){
        int count=2;
        boolean ans=false;
        while (count*count<input){
            if (input%count==0){
                return ans;
            }else {
                ans = true;
                count++;
            }
        }
        return ans;
    }
}
