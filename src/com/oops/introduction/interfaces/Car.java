package com.oops.introduction.interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like normal car");
    }
}
