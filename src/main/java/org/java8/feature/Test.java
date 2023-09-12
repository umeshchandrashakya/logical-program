package org.java8.feature;

public class Test {


    public static void main(String[] args) {
       DefaultExample d = ()->{
           System.out.println("Hey");
       };
       d.m1();
        System.out.println(d.m2(4));
        System.out.println(DefaultExample.m3(5));
    }
}
