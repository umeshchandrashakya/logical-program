package org.perfactnumber;

public class PrintAllPerfectWithinRange {
    public static void main(String[] args) {
        for (int i = 1;i<100;i++){
            if (isPerfectNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPerfectNumber(int num) {
        int sum = 0;
        int i=1;
        while (i<=num/2){
            if (num%i==0){
                sum = sum+i;
            }
            i++;
        }
        if (sum==num){
            return true;
        }else {
            return false;
        }
    }
}
