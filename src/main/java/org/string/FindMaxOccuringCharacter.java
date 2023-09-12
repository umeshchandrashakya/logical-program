package org.string;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindMaxOccuringCharacter {
    public static void main(String[] args) {
        String str = "aabbbbbccaabbbbbcc";
        System.out.println(maximumOccuringChar(str));
    }
    public static char maximumOccuringChar(String str) {

        return str.chars()
                .mapToObj(x -> (char) x)                  // box to Character
                .collect(groupingBy(x -> x, counting()))  // collect to Map<Character, Long>
                .entrySet().stream()
                .max(comparingByValue())                  // find entry with largest count
                .get()                                    // or throw if source string is empty
                .getKey();

    }
}
