package com.oops.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//       int a = 10;
//       int b = 15;

        Integer a = 10;
        Integer b = 15;

//        Integer num = 20;
//        Integer num = new Integer(20); // Integer is call wrapper class

        swap(a, b);
        System.out.println(a+" "+b);

        final A sohail = new A("Mohd Sohail");
        sohail.name = "other name";

        //when a non primitive is final, we cannot re-assign it.
//        sohail = new A("new object");

//        A obj;
//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random objects");
//        }
    }

    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
