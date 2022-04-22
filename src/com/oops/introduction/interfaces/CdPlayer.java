package com.oops.introduction.interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("player start");
    }

    @Override
    public void stop() {
        System.out.println("player stopeed");
    }
}
