package org.linearsearch;

public class EvenDigitNumber {
    public static void main(String[] args) {
        //given array return how many of them contains even digit;
        int arr[]={2,60,234,89,1919};
        int count =0;
        for (int j : arr) {
            int digit = getDigit(j);
            if (checkEvenDigit(digit)) {
                count++;
            }
        }
        System.out.println("Even digit number:"+count);

    }

    static int getDigit(int num){
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }
        return count;
    }

    public static boolean checkEvenDigit(int num){
        return num%2==0;
    }
}
