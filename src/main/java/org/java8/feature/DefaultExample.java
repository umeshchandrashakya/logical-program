package org.java8.feature;

public interface DefaultExample {
    void m1();

    default int m2(int num) {
        return num * num;
    }
    static int m3(int num){
        return num-2;
    }

}
