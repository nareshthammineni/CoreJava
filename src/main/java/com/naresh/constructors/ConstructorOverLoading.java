package com.naresh.constructors;

public class ConstructorOverLoading {

    private int id;

    private String name;

    public ConstructorOverLoading(){
        System.out.println("Default ConstructorOverLoading");
    }

    public ConstructorOverLoading(int id){

        this.id=id;
        System.out.println("ConstructorOverLoading "+this.id);
    }
    public  ConstructorOverLoading(String name){
        this.name=name;
        System.out.println("ConstructorOverLoading "+this.name);

    }

    public  ConstructorOverLoading(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("ConstructorOverLoading with Id :"+this.id+" and Name :"+this.name);
    }

    public static void main(String []args){
        ConstructorOverLoading defaultConstructorOverLoading= new ConstructorOverLoading();

        ConstructorOverLoading constructorOverLoadingwithId = new ConstructorOverLoading(2);

        ConstructorOverLoading constructorOverLoadingwithName = new ConstructorOverLoading("Naresh");

        ConstructorOverLoading constructorOverLoadingwithAll = new ConstructorOverLoading(3,"God");

    }
}
