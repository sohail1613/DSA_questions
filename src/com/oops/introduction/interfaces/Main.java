package com.oops.introduction.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.brake();
//        car.brake();
//        car.start();
//        car.stop();
//        car.acc();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();

        car.upGradeEngine();
        car.start();
    }
}
