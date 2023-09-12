package org.power;

public class SwipNumberWithoutTemp {
    public static void main(String[] args) {
        swap(10,20);
    }
    public static void swap(int x,int y){
        //x = x+y =>x =30
        //y=x-y=>30-20=>y=10
        //x = x-y=>30-10=>20
        x= x+y;
        y=x-y;
        x=x-y;
        System.out.println("x="+x);
        System.out.println("y="+y);

    }

}
