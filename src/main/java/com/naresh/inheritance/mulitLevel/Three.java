package com.naresh.inheritance.mulitLevel;

public class Three extends Two {
    public void three(){
        System.out.println("From Class Three");
    }

    public static void main(String[] args){
        Three th = new Three();
        th.one();
        th.two();
        th.three();

    }
}
