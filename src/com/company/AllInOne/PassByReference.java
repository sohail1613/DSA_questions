package com.company.AllInOne;

public class PassByReference {
    int a = 10;
    void call(PassByReference p){
        p.a = p.a+10;
    }

    public static void main(String[] args) {
        PassByReference passByReference= new PassByReference();
        System.out.println("Before pass by Reference "+passByReference.a);

        //passing object as value
        passByReference.call(passByReference);
        System.out.println("After pass by reference "+passByReference.a);
    }
}
