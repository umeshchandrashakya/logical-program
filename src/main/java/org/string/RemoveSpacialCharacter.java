package org.string;

public class RemoveSpacialCharacter {

    //write a java program to remove spacial character
    //String str = "$ja!va$&st%ar";
    public static void main(String[] args) {
        String str = "$ja!va$&st%ar";
        String withoutSpecialChar = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(withoutSpecialChar);
    }
}
