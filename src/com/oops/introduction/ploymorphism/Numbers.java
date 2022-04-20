package com.oops.introduction.ploymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
//        compile time or static Overloading
        obj.sum(2, 3);
        obj.sum(2, 3, 4);

    }
}
