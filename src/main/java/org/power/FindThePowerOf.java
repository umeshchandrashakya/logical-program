package org.power;

public class FindThePowerOf {
    public static void main(String[] args) {
        //base a power 2
        //10 to 2
        int base =2;
        int exponent = 3;
        System.out.println(findthePowerOf(base,exponent));
    }
    public static int findthePowerOf(int base,int exponent){
        int result =1;
        while (exponent!=0){
            result =result*base;
            exponent--;
        }
        return result;
    }
}
