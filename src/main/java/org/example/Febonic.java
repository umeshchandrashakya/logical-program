package org.example;

import java.util.Scanner;

public class Febonic {


    public static int findNthFiboNumber(int num){
        int a=0;
        int b=1;
        int count =2;
        while(count<=num){
            int temp = b;
            b = a+b;
            a=temp;
            count++;
        }
        return b;
    }

    public static void printFabonic(int num){
        int a = 0;
        int b=1;
        int count=2;
        System.out.print(a+","+b);
        while (count<=num){
            int temp = b;
            b=a+b;
            System.out.print(","+b);
            a = temp;
            count++;
        }

    }
    public static void main(String[] args) {
        //Q. find the 7th fibonic number.
        Scanner sc = new Scanner(System.in);
        System.out.println("N th fibo number:"+findNthFiboNumber(sc.nextInt()));
        printFabonic(7);
    }
}
