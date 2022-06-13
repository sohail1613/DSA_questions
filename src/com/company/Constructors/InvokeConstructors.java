package com.company.Constructors;

public class InvokeConstructors {
    InvokeConstructors(int x, int y){
        this(5);
        System.out.println(x*y);
    }
    InvokeConstructors(int x){
        this();
        System.out.println(x);
    }
    InvokeConstructors(){
        System.out.println("Default constructor");
    }
}
