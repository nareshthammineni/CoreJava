package com.naresh.objects;

public class MyFirstObject {
    private String name;
    private int id;

    public MyFirstObject(int id,String name){
        this.name=name;
        this.id=id;
    }

    public void getDetails(){

        System.out.println(this.id+"  "+this.name);
    }


    public static void main(String[] args){
        MyFirstObject obj = new MyFirstObject(1,"Naresh");
       obj.getDetails();


    }
}
