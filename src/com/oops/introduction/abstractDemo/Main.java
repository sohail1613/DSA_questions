package com.oops.introduction.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(26);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(25);
        daughter.career();

        //we cannot create object of abstract class (compile time error)
        //Parent mom = new Parent(45);

        Parent.hello();
    }
}
