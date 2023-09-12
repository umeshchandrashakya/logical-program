package org.example;

public class Loops {

    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println(i);
        }

        //while loop
        int max=20;
        while (max<30){
            System.out.println("umesh");
            max++;
        }

        ///do while
        //it will execute at least one time even condition is false.
        //first statemnt will execute. post that condition will check.
        int a =1;
        do{
            System.out.println(a);
        }while (a!=1);
    }


}
