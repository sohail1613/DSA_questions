package com.company.AllInOne;

public class PassByValue {
    //original value will not change
    int a = 10;
    void call(int a){
        a=a+10; //local variable subject to change
    }

    public static void main(String[] args){
        PassByValue passByValue= new PassByValue();
        System.out.println("Before call by value "+passByValue.a);
        /** 'a' will still be unchanged since the passing parameter is a primitive type **/
        passByValue.call(12345);
        System.out.println("After call by value "+passByValue.a);
    }
}
