package com.oops.introduction.abstractDemo;

//public class Parent {
//    abstract void career(String name);
//}

//if any class that contains one or more abstract method, then class must be declared as abstract
public abstract class Parent {
    int age;
    public Parent(int age){ // we can also create constructor pf abstract class
        this.age = age;
    }
    //we can create abstract static method
    static void hello(){
        System.out.println("Hello method");
    }

    void normal(){
        System.out.println("Its normal method");
    }
    abstract void career();
    abstract void partner();
}
