package com.naresh.Polymorphism.compiletime;

public class CompileTimePolymorphismExample {

    public CompileTimePolymorphismExample(){
        System.out.println("Default constructor....");
    }

    public CompileTimePolymorphismExample(int id,String name){
        System.out.println("Hello "+name+" your Id is :"+id);
    }

    public static void main(String[] args){
        CompileTimePolymorphismExample compileTimePolymorphismExample=new CompileTimePolymorphismExample();

        CompileTimePolymorphismExample compileTimePolymorphismExample1 = new CompileTimePolymorphismExample(2,"Naresh");
    }
}
