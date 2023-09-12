package org.string;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        String str = "ja va K";
        String ans = str.replaceAll("\\s","");
        System.out.println(ans);
    }
}
