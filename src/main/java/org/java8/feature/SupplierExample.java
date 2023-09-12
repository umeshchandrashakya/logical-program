package org.java8.feature;

import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        //supplier is a functional interface which does not take any input but return the required object
        // it just supply the required object and won't take any input.
        Supplier<String> s = ()->{
            String otp ="";
            for (int i=0;i<6;i++){
                otp = otp+(int)(Math.random()*10);
            }
            return otp;


        };
        IntPredicate intPredicate = (x)-> x>10;
        System.out.println(intPredicate.test(30));
    }
}
