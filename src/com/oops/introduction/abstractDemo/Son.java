package com.oops.introduction.abstractDemo;

public class Son extends Parent{
    public Son(int age){
        //this.age = age;
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("Benim Sohail");
    }

    @Override
    void partner() {
        System.out.println("about me learning coding");
    }
}
