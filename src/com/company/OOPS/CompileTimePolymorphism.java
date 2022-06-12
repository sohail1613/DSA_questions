package com.company.OOPS;

public class CompileTimePolymorphism {
    public int add(int x, int y){
        return x+y;
    }
    public int add(int x, int y, int z){
        return x+y+z;
    }
    public int add(int x, double y){
        return x+(int)y; //casting double to int
    }
    public int add(double x, int y){
        return (int)(x+y);
    }

}
class Test{
    public static void main(String[] args) {
        CompileTimePolymorphism compileDemo= new CompileTimePolymorphism();
        //compile will look at arguments and decide which method to call
        //hence , it is known as compile-time polymorphism or Static polymorphism
        System.out.println(compileDemo.add(2, 5));
    }
}
