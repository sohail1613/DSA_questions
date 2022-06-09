package com.company.interferance;

public class A {
    void m1(){
        System.out.println("First");
    }

    interface B{
        void m2();
    }
}

class C extends A{
    void m1(){
        System.out.println("Second");
        super.m1();
    }
}

class Test implements A.B{
    @Override
    public void m2() {
        System.out.println("Third");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m2();
        C c = new C();
        c.m1();
    }
}
