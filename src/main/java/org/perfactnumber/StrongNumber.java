package org.perfactnumber;

public class StrongNumber {
    public static void main(String[] args) {
       checkGivenNumberIsStrongOrNot(145);
       // System.out.println(findFactorialOfItsDigit(5));
    }

    private static void checkGivenNumberIsStrongOrNot(int num) {
        int sum=0;
        int lastDigit=0;
        int temp =num;
        while (temp>=1){
            lastDigit = temp%10;
          int facto =  findFactorialOfItsDigit(lastDigit);
          sum  = sum+facto;
          temp = temp/10;

        }
        if (sum==num){
            System.out.println("Given Number is strong number");
        }else {
            System.out.println("Given Number is not strong");
        }
    }

    private static int findFactorialOfItsDigit(int lastDigit) {
        int fact =1;
        for (int i=1;i<=lastDigit;i++){
            fact = fact*i;
        }
        return fact;
    }
}
