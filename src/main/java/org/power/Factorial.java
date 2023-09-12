package org.power;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(printTheFactorial(5));
    }
    public static int printTheFactorial(int input){
        int result =1;
        for (int i=1;i<=5;i++){
            result = result*i;
        }
        return result;
    }
}
