package org.example;

public class CountNums {
    public static void main(String[] args) {
        int num =578789777;
        //find the 7 how many times coming.
        int rem;
        int count=0;
        while (num > 0){
            rem = num%10;
            if (rem == 7){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
