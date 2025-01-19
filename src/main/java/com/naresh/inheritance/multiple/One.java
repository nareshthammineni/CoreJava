package com.naresh.inheritance.multiple;

public class One extends Base{
    public void one(){
        System.out.println("From one");
    }

    public static void main(String[]args){
        One one = new One();
        one.one();
        one.base();
    }
}
