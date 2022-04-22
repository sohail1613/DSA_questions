package com.oops.introduction.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerate");
    }
}
