package com.oops.introduction.ploymorphism;

class Splendor extends Bike{
    @Override
    void run() {
        System.out.println("Running at 60 km/h.");
//        super.run();
    }

    public static void main(String[] args) {
        Bike b = new Splendor();// upcasting
        //When the reference variable of Parent class refers to the object of Child class is called upCasting.
        b.run();
    }
}
