package com.naresh.Polymorphism.compiletime;

public class RunTimeExample extends Base{

    public void basefun(){
        System.out.println("From RunTime Example ");
    }

    public static void main(String[]args){
        Base run = new RunTimeExample();
        run.basefun();
    }
}
