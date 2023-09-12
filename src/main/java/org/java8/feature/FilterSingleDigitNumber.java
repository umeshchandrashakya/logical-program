package org.java8.feature;

import java.util.Arrays;

public class FilterSingleDigitNumber {
    public static void main(String[] args) {
        int arr [] = {10,2,3,4,90,1,-1,-20,-2,-80,-9};
        Arrays.stream(arr).filter(item->item<10 && item>0 || item<=-1 && item>-10).forEach(System.out::println);
    }
}
