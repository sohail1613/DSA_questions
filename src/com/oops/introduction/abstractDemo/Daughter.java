package com.oops.introduction.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
       // this.age = age;
    }
    @Override
    void career() {
        System.out.println("my name is falane");
    }

    @Override
    void partner() {
        System.out.println("i am coder");
    }
}
