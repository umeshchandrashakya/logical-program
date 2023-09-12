package org.java8.feature;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // it takes some input and will not return anything
        Consumer<String> s = (i)->{
            System.out.println(i);
        };
        s.accept("umesh");
    }
}
