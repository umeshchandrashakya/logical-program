package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        while (true) {
            System.out.println("Enter operator");
            char op = sc.next().charAt(0);
            if (op=='+' || op == '-' || op == '*' || op =='/' || op == '%'){
                System.out.println("Enter two Number:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (op=='+'){
                    ans = num1+num2;
                }
                if (op=='-'){
                    ans = num1-num2;
                }
                if (op=='*'){
                    ans = num1*num2;
                }

                if (op=='/'){
                    ans = num1/num2;
                }
                if (op=='%'){
                    ans = num1%num2;
                }
                System.out.println(ans);
            }else if (op=='x' || op=='X'){
                break;
            }
            else {
                System.out.println("invalid operation!");
            }
        }
    }
}
