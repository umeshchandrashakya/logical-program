package org.java8.feature;

import java.util.function.Function;

public class FuncationExample {
    public static void main(String[] args) {
        Function<Integer,Integer> f = (a)->a*2;
        System.out.println(f.apply(3));
    }
}
