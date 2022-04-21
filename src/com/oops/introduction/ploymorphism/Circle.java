package com.oops.introduction.ploymorphism;

public class Circle extends Shape{
    @Override // this is called Annotation
    //this will run when obj f circle is created
    //Hence, it is Overriding the parent method
    void area(){
        System.out.println("Area is (pie * radius * radius)");
    }
}
