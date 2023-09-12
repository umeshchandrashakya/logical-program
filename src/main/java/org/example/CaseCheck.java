package org.example;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }else {
            System.out.println("uppercase");
        }
    }
}
