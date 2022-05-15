package com.oops.introduction.Inheritance;
//Single level inheritance

class Animal {
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
