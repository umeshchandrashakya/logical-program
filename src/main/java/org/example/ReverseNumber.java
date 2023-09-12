package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345879;
        int sum =0;
        while (num > 0){
            int rem = num%10;
            num = num/10;
            sum = sum*10+rem;
        }
        System.out.println(sum);
    }
}
