package org.power;

public class CheckNumberIsPowerOF {
    public static void main(String[] args) {
       boolean ans =  isNumberIsPowerOf10(100);
        System.out.println(ans);
    }

    public static boolean isNumberIsPowerOf10(int input){
        //System.out.println(input%5);
        while (input%10==0){
            input=input/10;
        }
        if (input==1){
            return true;
        }else {
            return false;
        }
    }
}
