package com.oops.introduction.ploymorphism;

 class ExampleA {
    int a, b, c;
    public void add(int x, int y){
        a = x;
        b = y;
        System.out.println("Sum of a and b is :"+(a+b));
    }
    public void add(int x, int y, int z){
        a = x;
        b = y;
        c = z;
        System.out.println("Sum of a, b and c is :"+(a+b+c));
    }
    public void print(){
        System.out.println("Class ExampleA is running");
    }
}

class ExampleB extends ExampleA{
     public void print(){
         System.out.println("ExampleB class is running");
     }
}
