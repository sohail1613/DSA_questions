package com.company.OOPS;

public class RuntimePolymorphism {
    public void run(){
        System.out.println("Parent method called.");
    }
}
class Child extends RuntimePolymorphism{
    public void run(){
        System.out.println("Child method called.");
    }
}

class RuntimeExample {
    public static void main(String[] args) {
        RuntimePolymorphism runtime = new Child();
        runtime.run();//it will run child method

        runtime = new RuntimePolymorphism();
        runtime.run();//it will run parent method cause it decided at runtime, which method to run

    }
}
