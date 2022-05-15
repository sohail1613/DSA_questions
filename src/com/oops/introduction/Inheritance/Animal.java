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

//Multi-Level inheritance
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}

//Hierarchical Inheritance (two or more classes inherits a single class)
class Cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}