package org.example;

public class PrimeNumber2 {
    public static void main(String[] args) {
        printPrimeNumberBetweenRange(1,100);
    }
    public static void printPrimeNumberBetweenRange(int start,int end){

        for (int i=start;i<=end;i++){
            if (isPrime(i))
                System.out.println(i);
        }

    }
    static boolean isPrime(int num){
        for (int i=2;i<num/2;i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

}
