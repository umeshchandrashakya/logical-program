package org.perfactnumber;

import javax.swing.plaf.IconUIResource;

public class ArmstsrongNumberExample {
    public static void main(String[] args) {
        boolean b = checkGivenNumberIsArms(153);
        if (b){
            System.out.println("number is armstrong");
        }else {
            System.out.println("number is not armstrong");
        }
    }

    private static boolean checkGivenNumberIsArms(int num) {
        int digit=0;
        int temp =num;
        int reminder=0;
        while (temp>0){
            temp = temp/10;
            digit++;
        }
        temp = num;
        int sum =0;
        while (temp>0){
            reminder = temp%10;
            int p = pow(reminder,digit);
            sum = sum+p;
            temp=temp/10;
        }
        if (sum==num){
            return true;
        }else {
            return false;
        }

    }

    public static int pow(int base,int exponent){
        int result=1;
        while (exponent!=0){
            result = result*base;
            exponent--;
        }
        return result;
    }
}
